package com.chunfeng.service.customizeException.user;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.ServiceException;

/**
 * 用户服务模块异常超类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/1
 */
public class UserException extends ServiceException {
    public UserException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
