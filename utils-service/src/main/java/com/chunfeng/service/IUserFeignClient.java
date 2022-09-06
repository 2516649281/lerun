package com.chunfeng.service;

import com.chunfeng.domain.JsonRequest;
import com.chunfeng.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 用户服务远程调用
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/2
 */
@FeignClient("user-service/user")
@ResponseBody
public interface IUserFeignClient {

    /**
     * 根据id值查询用户
     *
     * @param userIds 用户id
     * @return JSON
     */
    @GetMapping("/selectI")
    JsonRequest<List<User>> selectUserById(@RequestParam("userIds") Long[] userIds);
}
