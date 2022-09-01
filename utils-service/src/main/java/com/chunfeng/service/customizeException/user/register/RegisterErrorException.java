package com.chunfeng.service.customizeException.user.register;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 注册失败
 * @author by 春风能解释
 * <p>
 * 2022/8/31
 */
public class RegisterErrorException extends RegisterException {

    public RegisterErrorException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
