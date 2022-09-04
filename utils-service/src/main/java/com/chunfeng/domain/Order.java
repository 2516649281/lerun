package com.chunfeng.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 订单服务实体类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/3
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 订单名称
     */
    private String orderName;
    /**
     * 订单状态(0未接单,1已接单,2已完成,3已退款)
     */
    private Integer orderStatus;
    /**
     * 支付id
     */
    private Long payId;
    /**
     * 支付信息
     */
    private Pay pay;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户信息
     */
    private User user;
    /**
     * 下单时间
     */
    private String placeTime;
    /**
     * 接单时间
     */
    private String takeTime;
}
