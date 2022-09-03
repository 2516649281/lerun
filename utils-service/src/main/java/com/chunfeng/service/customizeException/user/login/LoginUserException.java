package com.chunfeng.service.customizeException.user.login;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.user.UserException;

/**
 * 登录类异常超类
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/30
 */
public class LoginUserException extends UserException {

    public LoginUserException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
