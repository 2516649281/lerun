package com.chunfeng.service.impl;

import com.chunfeng.domain.JsonRequest;
import com.chunfeng.domain.User;
import com.chunfeng.po.UserMapper;
import com.chunfeng.service.IUserService;
import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.user.delete.DeleteExistsException;
import com.chunfeng.service.customizeException.user.login.PasswordErrorException;
import com.chunfeng.service.customizeException.user.login.UserNotExistsException;
import com.chunfeng.service.customizeException.user.register.RegisterErrorException;
import com.chunfeng.service.customizeException.user.register.UserExistsException;
import com.chunfeng.service.customizeException.user.select.SelectSourceIsNullException;
import com.chunfeng.service.customizeException.user.update.UpdateErrorException;
import com.chunfeng.service.customizeException.user.update.UpdateNotExistsException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.text.SimpleDateFormat;
import java.util.*;

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
    @Value("${user.timeFormat}")
    private String timeFormat;

    /**
     * 用户登录
     *
     * @param userName     用户名
     * @param userPassword 用户密码
     * @return JSON
     */
    @Override
    public JsonRequest<User> login(String userName, String userPassword) {
        User user = userMapper.selectByName(userName);
        if (Objects.isNull(user)) {
            throw new UserNotExistsException(ServiceEnum.USER_NOT_EXISTS);
        }
        //盐值
        String key = user.getUserPassword().split("\\$")[0];
        //加密密码
        String password = key + "$" + getPassword(userPassword, key);
        if (!password.equals(user.getUserPassword())) {
            throw new PasswordErrorException(ServiceEnum.PASSWORD_ERROR);
        }
        log.info("用户" + userName + "登录成功!");
        return new JsonRequest<>(user);
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
                        new SimpleDateFormat(timeFormat).format(new Date()),//创建时间
                        new SimpleDateFormat(timeFormat).format(new Date())));//修改时间
        if (column < 1) {
            throw new RegisterErrorException(ServiceEnum.REGISTER_ERROR);
        }
        log.info("用户" + userName + "注册成功!");
        return new JsonRequest<>(column);
    }

    /**
     * 根据id值修改用户
     *
     * @param users 待修改的数据
     * @return JSON
     */
    @CacheEvict(value = "users", allEntries = true)
    @Override
    public JsonRequest<Integer> updateById(List<User> users) {
        List<User> selectUsers = new ArrayList<>();
        for (User user : users) {
            User selectUser = userMapper.selectAllByUserId(user.getUserId());
            selectUsers.add(selectUser);
            //如果修改密码,则加密
            if (user.getUserPassword() != null) {
                //盐值
                String key = selectUser.getUserPassword().split("\\$")[0];
                //加密密码
                String password = key + "$" + getPassword(user.getUserPassword(), key);
                user.setUserPassword(password);
            }
            user.setUpdateTime(
                    new SimpleDateFormat(timeFormat).format(new Date())
            );
        }
        //数据检测
        for (User selectUser : selectUsers) {
            //判断物理数据和逻辑数据
            if (Objects.isNull(selectUser) || selectUser.getUserStatus() == 1) {
                throw new UpdateNotExistsException(ServiceEnum.UPDATE_NOT_EXISTS);
            }
        }
        //修改时间
        Integer integer = userMapper.updateUserById(users);
        if (integer < users.size()) {
            throw new UpdateErrorException(ServiceEnum.UPDATE_ERROR);
        }
        log.info(users.size() + "个用户修改成功!");
        return new JsonRequest<>(integer);
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
        if (ArrayUtils.isEmpty(new List[]{users})) {
            throw new SelectSourceIsNullException(ServiceEnum.SELECT_IS_NULL);
        }
        return new JsonRequest<>(users);
    }

    /**
     * 根据id值批量删除用户
     *
     * @param userId 用户id
     * @return JSON
     */
    @CacheEvict(value = "users", allEntries = true)
    @Override
    public JsonRequest<Integer> deleteUserById(Long[] userId) {
        Integer integer = userMapper.deleteByUserId(userId);
        if (integer < userId.length) {
            throw new DeleteExistsException(ServiceEnum.DELETE_EXISTS);
        }
        return new JsonRequest<>(integer);
    }

    /**
     * 加密密码
     *
     * @param password 原始密码
     * @param salt     盐值
     * @return 加密后的新密码
     */
    public String getPassword(String password, String salt) {
        //加密10次
        for (int i = 0; i < 10; i++) {
            //MD5加密算法
            password = DigestUtils.md5DigestAsHex((salt + password + salt).getBytes()).toUpperCase();//重组
        }
        return password;
    }
}
