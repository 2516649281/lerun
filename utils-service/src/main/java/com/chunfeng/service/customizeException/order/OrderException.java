package com.chunfeng.service.customizeException.order;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.ServiceException;

/**
 * 订单类异常超类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/3
 */
public class OrderException extends ServiceException {
    public OrderException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
