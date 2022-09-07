package com.chunfeng.service.customizeException.user.login;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 用户未登录异常
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/2
 */
public class UserNotLoginException extends LoginUserException {
    public UserNotLoginException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
