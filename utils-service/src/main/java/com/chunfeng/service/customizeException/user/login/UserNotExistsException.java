package com.chunfeng.service.customizeException.user.login;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 用户不存在异常
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/30
 */
public class UserNotExistsException extends LoginException {

    public UserNotExistsException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
