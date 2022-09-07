package com.chunfeng.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 支付服务实体类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pay implements Serializable {
    /**
     * 支付编号
     */
    private Long payId;
    /**
     * 支付的价格
     */
    private String payMoney;
    /**
     * 支付方式
     */
    private String payType;
    /**
     * 支付状态(0未支付,1已支付,2已退款)
     */
    private Integer payStatus;
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 用户信息
     */
    private User user;
    /**
     * 支付时间
     */
    private String payTime;
    /**
     * 退款时间
     */
    private String refundTime;
}
