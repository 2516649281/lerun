package com.chunfeng.vo;

import com.chunfeng.domain.JsonRequest;
import com.chunfeng.domain.User;
import com.chunfeng.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 用户操作控制类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/1
 */
@RestController
@RequestMapping("/user")
public class UserController extends ServiceController {

    @Autowired
    private IUserService userService;


    /**
     * 用户登录
     *
     * @param userName     用户名
     * @param userPassword 用户密码
     * @return JSON
     */
    @PostMapping("/login")
    public JsonRequest<String> login(@RequestParam("userName") String userName, @RequestParam("userPassword") String userPassword) {
        return userService.login(userName, userPassword);
    }

    /**
     * 注册
     *
     * @param userName     用户名
     * @param userPassword 密码
     * @return JSON
     */
    @PostMapping("/register")
    public JsonRequest<Integer> register(@RequestParam("userName") String userName, @RequestParam("userPassword") String userPassword) {
        return userService.register(userName, userPassword);
    }

    /**
     * 根据id值批量查询用户信息
     *
     * @param userIds 用户id
     * @return JSON
     */
    @GetMapping("/selectI")
    public JsonRequest<List<User>> selectById(@RequestParam("userIds") Long[] userIds) {
        return userService.selectById(userIds);
    }

    /**
     * 根据id值修改用户
     *
     * @param users 待修改的数据
     * @return JSON
     */
    @PutMapping("/update")
    public JsonRequest<Integer> updateById(@RequestBody List<User> users) {
        return userService.updateById(users);
    }

    /**
     * 查询所有用户
     *
     * @return JSON
     */
    @GetMapping("/select")
    public JsonRequest<List<User>> selectAll() {
        return userService.selectAll();
    }

    /**
     * 根据id值批量删除用户
     *
     * @param userId 用户id
     * @return JSON
     */
    @DeleteMapping("/delete")
    public JsonRequest<Integer> deleteUserById(@RequestBody Long[] userId) {
        return userService.deleteUserById(userId);
    }
}
