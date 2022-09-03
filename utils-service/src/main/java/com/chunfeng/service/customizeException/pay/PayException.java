package com.chunfeng.service.customizeException.pay;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.ServiceException;

import java.rmi.ServerException;

/**
 * 支付服务模块异常超类
 * @author by 春风能解释
 * <p>
 * 2022/9/1
 */
public class PayException extends ServiceException {

    public PayException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
