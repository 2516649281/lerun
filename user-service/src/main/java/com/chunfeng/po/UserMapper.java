package com.chunfeng.po;

import com.chunfeng.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户数据层接口
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/30
 */
public interface UserMapper {

    /**
     * 根据账号名查询用户
     *
     * @param userName 用户名
     * @return User
     */
    User selectByName(String userName);

    /**
     * 查询所有用户
     *
     * @return User
     */
    List<User> selectAllUser();

    /**
     * 根据id值批量查询账号
     *
     * @param userIds 账号id
     * @return User
     */
    List<User> selectAllByUserId(@Param("userIds") Long[] userIds);


    /**
     * 添加用户
     *
     * @param user 用户信息
     * @return 影响行数
     */
    Integer insertUser(User user);

    /**
     * 根据id值修改当前用户
     *
     * @param users 用户信息
     * @return 影响行数
     */
    Integer updateUserById(@Param("users") List<User> users);

    /**
     * 根据id值批量删除账号
     *
     * @param userIds 用户id
     * @return 影响行数
     */
    Integer deleteByUserId(@Param("userIds") Long[] userIds);
}
