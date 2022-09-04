package com.chunfeng.service.impl;

import com.chunfeng.domain.JsonRequest;
import com.chunfeng.domain.User;
import com.chunfeng.po.UserMapper;
import com.chunfeng.service.IUserService;
import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.user.delete.DeleteExistsException;
import com.chunfeng.service.customizeException.user.login.UserNotExistsException;
import com.chunfeng.service.customizeException.user.login.UserPasswordErrorException;
import com.chunfeng.service.customizeException.user.register.RegisterErrorException;
import com.chunfeng.service.customizeException.user.register.UserExistsException;
import com.chunfeng.service.customizeException.user.select.SelectUserSourceIsNullException;
import com.chunfeng.service.customizeException.user.update.UpdateUserErrorException;
import com.chunfeng.service.customizeException.user.update.UpdateUserNotExistsException;
import com.chunfeng.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * 用户操作业务层实现类
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/30
 */
@Service
@Slf4j
@Transactional
public class UserServiceImpl implements IUserService {

    /**
     * 用户持久层
     */
    @Autowired
    private UserMapper userMapper;

    /**
     * 时间格式
     */
    @Value("${utils.server.format}")
    private String timeFormat;

    /**
     * 用户登录
     *
     * @param userName     用户名
     * @param userPassword 用户密码
     * @return JSON
     */
    @Override
    @Cacheable(value = "user_login", key = "#userName")
    public JsonRequest<String> login(String userName, String userPassword) {
        User user = userMapper.selectByName(userName);
        if (Objects.isNull(user)) {
            throw new UserNotExistsException(ServiceEnum.USER_NOT_EXISTS);
        }
        //盐值
        String key = user.getUserPassword().split("\\$")[0];
        //加密密码
        String password = key + "$" + getPassword(userPassword, key);
        if (!password.equals(user.getUserPassword())) {
            throw new UserPasswordErrorException(ServiceEnum.USER_PASSWORD_ERROR);
        }
        //构造token
        String token = new JwtUtils<>().createToken(user);
        log.info("用户" + userName + "登录成功!");
        //将已登陆的用户id存储到redis中
        return new JsonRequest<>(token);
    }

    /**
     * 注册
     *
     * @param userName     用户名
     * @param userPassword 密码
     * @return JSON
     */
    @CacheEvict(value = "users", allEntries = true)
    @Override
    public JsonRequest<Integer> register(String userName, String userPassword) {
        //判断数据库是否有这个用户
        User user = userMapper.selectByName(userName);
        if (Objects.nonNull(user)) {
            throw new UserExistsException(ServiceEnum.USER_EXISTS);
        }
        String salt = UUID.randomUUID().toString().toUpperCase();//随机生成盐值
        Integer column = userMapper.insertUser(
                new User(userName,//用户名
                        salt + "$" + getPassword(userPassword, salt),//密码
                        new SimpleDateFormat(timeFormat).format(new Date())//创建时间
                ));
        if (column < 1) {
            throw new RegisterErrorException(ServiceEnum.USER_REGISTER_ERROR);
        }
        log.info("用户" + userName + "注册成功!");
        return new JsonRequest<>(column);
    }

    /**
     * 根据id值批量查询用户信息
     *
     * @param userIds 用户id
     * @return JSON
     */
    @Cacheable(value = "users_Id")
    @Override
    public JsonRequest<List<User>> selectById(Long[] userIds) {
        List<User> users = userMapper.selectAllByUserId(userIds);
        if (users.isEmpty()) {
            throw new SelectUserSourceIsNullException(ServiceEnum.SELECT_USER_IS_NULL);
        }
        return new JsonRequest<>(users);
    }

    /**
     * 根据id值修改用户
     *
     * @param users 待修改的数据
     * @return JSON
     */
    @CacheEvict(value = {"users", "users_Id", "user_login"}, allEntries = true)
    @Override
    public JsonRequest<Integer> updateById(List<User> users) {
        Long[] userIds = new Long[users.size()];
        //第一步,取出其中的用户id
        for (int i = 0; i < users.size(); i++) {
            Long userId = users.get(i).getUserId();
            //如果找到一个用户的id显示为空,则直接停止循环并交给判断处理
            if (userId == null) {
                break;
            }
            userIds[i] = userId;
        }
        //第二步,查询结果并判断
        List<User> userSelect = userMapper.selectAllByUserId(userIds);
        //比较查询前后集合的个数以确定数据的完整性
        if (userSelect.size() < users.size()) {
            throw new UpdateUserNotExistsException(ServiceEnum.UPDATE_USER_NOT_EXISTS);
        }
        //第三步,将带有密码的进行加密处理,为后续修改做准备
        for (User user : users) {
            if (user.getUserPassword() != null) {
                //随机生成盐值
                String key = UUID.randomUUID().toString().toUpperCase();
                //加密并修改原始的密码
                user.setUserPassword(
                        key + "$" + getPassword(user.getUserPassword(), key)
                );
                user.setUpdateTime(new SimpleDateFormat(timeFormat).format(new Date()));
            }
        }
        //最后一步,执行修改并监控修改结果
        Integer column = userMapper.updateUserById(users);
        if (column < 1) {
            throw new UpdateUserErrorException(ServiceEnum.UPDATE_USER_ERROR);
        }
        return new JsonRequest<>(column);
    }

    /**
     * 查询所有用户
     *
     * @return JSON
     */
    @Cacheable(value = "users")
    @Override
    public JsonRequest<List<User>> selectAll() {
        List<User> users = userMapper.selectAllUser();
        if (users.isEmpty()) {
            throw new SelectUserSourceIsNullException(ServiceEnum.SELECT_USER_IS_NULL);
        }
        return new JsonRequest<>(users);
    }

    /**
     * 根据id值批量删除用户
     *
     * @param userId 用户id
     * @return JSON
     */
    @CacheEvict(value = {"users", "users_Id", "user_login"}, allEntries = true)
    @Override
    public JsonRequest<Integer> deleteUserById(Long[] userId) {
        Integer column = userMapper.deleteByUserId(userId);
        if (column < 1) {
            throw new DeleteExistsException(ServiceEnum.DELETE_USER_EXISTS);
        }
        return new JsonRequest<>(column);
    }

    /**
     * 加密密码
     *
     * @param password 原始密码
     * @param salt     盐值
     * @return 加密后的新密码
     */
    public String getPassword(String password, String salt) {
        //加密10000次
        for (int i = 0; i < 10000; i++) {
            //MD5加密算法
            password = DigestUtils.md5DigestAsHex((salt + password + salt).getBytes()).toUpperCase();//重组
        }
        return password;
    }
}
