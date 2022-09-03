package com.chunfeng.service.customizeException.user.login;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 密码错误异常
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/30
 */
public class UserPasswordErrorException extends LoginUserException {

    public UserPasswordErrorException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
