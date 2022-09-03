package com.chunfeng.service.customizeException.pay.select;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.ServiceException;

import java.rmi.ServerException;

/**
 * 查询类异常超类
 * @author by 春风能解释
 * <p>
 * 2022/9/1
 */
public class SelectPayException extends ServiceException {

    public SelectPayException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
