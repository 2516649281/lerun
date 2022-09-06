package com.chunfeng.service;

import com.chunfeng.domain.JsonRequest;
import com.chunfeng.domain.User;

import java.util.List;

/**
 * 用户操作接口类
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/30
 */
public interface IUserService {


    /**
     * 用户登录
     *
     * @param userName 用户名
     * @return JSON
     */
    JsonRequest<String> login(String userName, String userPassword);

    /**
     * 注册
     *
     * @param userName     用户名
     * @param userPassword 密码
     * @return JSON
     */
    JsonRequest<Integer> register(String userName, String userPassword);

    /**
     * 根据id值批量查询用户信息
     *
     * @param userId 用户id
     * @return JSON
     */
    JsonRequest<List<User>> selectById(Long[] userId);

    /**
     * 根据id值修改用户
     *
     * @param users 待修改的数据
     * @return JSON
     */
    JsonRequest<Integer> updateById(List<User> users);

    /**
     * 查询所有用户
     *
     * @return JSON
     */
    JsonRequest<List<User>> selectAll();

    /**
     * 根据id值删除用户
     *
     * @param userId 用户id
     * @return JSON
     */
    JsonRequest<Integer> deleteUserById(Long[] userId);
}
