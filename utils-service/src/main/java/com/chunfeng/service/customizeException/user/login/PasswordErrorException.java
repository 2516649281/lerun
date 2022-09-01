package com.chunfeng.service.customizeException.user.login;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 密码错误异常
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/30
 */
public class PasswordErrorException extends LoginException {

    public PasswordErrorException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
