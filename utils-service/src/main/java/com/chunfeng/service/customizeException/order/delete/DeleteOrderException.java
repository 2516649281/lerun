package com.chunfeng.service.customizeException.order.delete;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.order.OrderException;

/**
 * 修改类异常超类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/3
 */
public class DeleteOrderException extends OrderException {
    public DeleteOrderException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
