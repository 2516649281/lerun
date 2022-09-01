package com.chunfeng.service.customizeException;

import lombok.Data;

/**
 * 业务层异常超类
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/30
 */
public class ServiceException extends RuntimeException {

    /**
     * 异常枚举
     */
    public ServiceEnum serviceEnum;

    public ServiceException(ServiceEnum serviceEnum) {
        super(serviceEnum.getMessage());
        this.serviceEnum = serviceEnum;
    }

    public ServiceException(Throwable cause, ServiceEnum serviceEnum) {
        super(serviceEnum.getMessage(), cause);
        this.serviceEnum = serviceEnum;
    }

    public ServiceException(Throwable cause, boolean enableSuppression, boolean writableStackTrace, ServiceEnum serviceEnum) {
        super(serviceEnum.getMessage(), cause, enableSuppression, writableStackTrace);
        this.serviceEnum = serviceEnum;
    }
}
