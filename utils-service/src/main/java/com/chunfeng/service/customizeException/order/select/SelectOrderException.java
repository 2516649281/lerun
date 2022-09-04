package com.chunfeng.service.customizeException.order.select;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.order.OrderException;

/**
 * 查询订单类异常超类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/3
 */
public class SelectOrderException extends OrderException {
    public SelectOrderException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
