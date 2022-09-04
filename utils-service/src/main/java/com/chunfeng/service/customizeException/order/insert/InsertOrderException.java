package com.chunfeng.service.customizeException.order.insert;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.order.OrderException;

/**
 * 添加订单类异常超类
 * @author by 春风能解释
 * <p>
 * 2022/9/3
 */
public class InsertOrderException extends OrderException {
    public InsertOrderException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
