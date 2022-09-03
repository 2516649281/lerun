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

    UPDATE_USER_NOT_EXISTS(401, "修改的数据不存在!"),
    UPDATE_USER_ERROR(402, "修改失败!"),

    DELETE_USER_EXISTS(501, "数据失效!"),

    //支付类
    SELECT_PAY_NOT_EXISTS(106, "支付数据为空!"),

    INSERT_PAY_ERROR(302, "添加支付订单失败!"),

    UPDATE_PAY_NOT_EXISTS(403, "待修改的支付订单不存在!"),
    UPDATE_PAY_ERROR(406, "修改支付订单失败!"),

    DELETE_PAY_NOT_EXISTS(502, "待删除的支付订单不存在!"),
    DELETE_PAY_ERROR(503, "删除支付订单失败!");


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
