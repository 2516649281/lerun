package com.chunfeng.service;

import com.chunfeng.domain.JsonRequest;
import com.chunfeng.domain.Pay;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author by 春风能解释
 * <p>
 * 2022/9/3
 */
@FeignClient("pay-service/pay")
public interface IPayFeignClient {

    /**
     * 根据支付订单id查询
     *
     * @param payIds 支付订单id值
     * @return JSON
     */
    @GetMapping("/selectI")
    JsonRequest<List<Pay>> selectPayById(@RequestParam("payIds") Long[] payIds);
}
