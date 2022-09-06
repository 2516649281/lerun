package com.chunfeng.service.customizeException;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 异常枚举类
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/31
 */
@AllArgsConstructor
@NoArgsConstructor
public enum ServiceEnum {
    //用户类
    USER_PASSWORD_ERROR(101, "密码错误!"),
    USER_NOT_EXISTS(102, "该用户不存在!"),
    USER_EXISTS(103, "该用户名好像不太受欢迎~"),
    SELECT_USER_IS_NULL(104, "用户数据为空!"),
    USER_NOT_LOGIN(105, "用户未登录"),

    USER_REGISTER_ERROR(301, "注册失败!"),

    UPDATE_USER_NOT_EXISTS(401, "一个或多个待修改的用户数据不存在!"),
    UPDATE_USER_ERROR(402, "一个或多个用户修改失败!"),

    DELETE_USER_EXISTS(501, "一个或多个用户数据失效!"),

    //支付类
    SELECT_PAY_NOT_EXISTS(106, "支付数据为空!"),

    INSERT_PAY_ERROR(302, "添加支付订单失败!"),

    UPDATE_PAY_NOT_EXISTS(403, "一个或多个待修改的支付订单不存在!"),
    UPDATE_PAY_ERROR(406, "一个或多个支付订单修改失败!"),

    DELETE_PAY_NOT_EXISTS(502, "一个或多个支付订单数据失效!"),
    DELETE_PAY_ERROR(503, "一个或多个支付订单数据删除失败!"),

    //订单类
    SELECT_ORDER_NOT_EXISTS(107, "订单结果为空!"),

    INSERT_ORDER_ERROR(303, "添加订单失败!"),

    UPDATE_ORDER_NOT_EXISTS(407, "一个或多个待修改的订单不存在!"),
    UPDATE_ORDER_ERROR(408, "一个或多个订单修改失败!"),

    DELETE_ORDER_NOT_EXISTS(504, "一个或多个订单数据失效"),
    DELETE_ORDER_ERROR(505, "一个或多个订单数据删除失败");


    /**
     * 状态
     */
    private Integer status;

    /**
     * 消息
     */
    private String message;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
