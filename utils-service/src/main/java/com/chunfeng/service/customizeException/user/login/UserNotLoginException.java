package com.chunfeng.service.customizeException.user.login;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.user.UserException;

/**
 * 用户未登录异常
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/2
 */
public class UserNotLoginException extends UserException {
    public UserNotLoginException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
