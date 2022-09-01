package com.chunfeng.service.customizeException.user.register;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.ServiceException;

/**
 * 注册类异常
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/31
 */
public class RegisterException extends ServiceException {

    public RegisterException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }

}
