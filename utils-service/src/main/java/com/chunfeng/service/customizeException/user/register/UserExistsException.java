package com.chunfeng.service.customizeException.user.register;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 用户名重复异常
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/31
 */
public class UserExistsException extends RegisterException {

    public UserExistsException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
