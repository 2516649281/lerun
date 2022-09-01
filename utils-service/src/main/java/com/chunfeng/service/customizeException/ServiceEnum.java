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
    PASSWORD_ERROR(101, "密码错误!"),
    USER_NOT_EXISTS(102, "该用户不存在!"),
    USER_EXISTS(301, "该用户名好像不受欢迎~"),
    REGISTER_ERROR(302, "注册失败!"),
    UPDATE_NOT_EXISTS(401, "修改的数据不存在!"),
    UPDATE_ERROR(402, "修改失败!"),
    SELECT_IS_NULL(601, "数据为空!"),
    DELETE_EXISTS(701, "数据失效!");

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
