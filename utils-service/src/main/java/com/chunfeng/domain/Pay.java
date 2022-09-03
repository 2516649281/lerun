package com.chunfeng.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 支付服务实体类
 * @author by 春风能解释
 * <p>
 * 2022/9/1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pay implements Serializable {
    private Long payId;//支付编号
    private String payMoney;//支付的价格
    private String payType;//支付方式
    private Integer payStatus;//支付状态
    private Long userId;//用户编号
    private User user;//用户信息
    private String payTime;//支付时间
    private String refundTime;//退款时间
}
