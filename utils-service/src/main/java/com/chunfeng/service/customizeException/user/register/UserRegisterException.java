package com.chunfeng.service.customizeException.user.register;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.user.UserException;

/**
 * 注册类异常
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/31
 */
public class UserRegisterException extends UserException {

    public UserRegisterException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }

}
