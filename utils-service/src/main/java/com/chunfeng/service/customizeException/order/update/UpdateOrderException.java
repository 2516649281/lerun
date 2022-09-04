package com.chunfeng.service.customizeException.order.update;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.order.OrderException;

/**
 * 修改订单异常超类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/3
 */
public class UpdateOrderException extends OrderException {
    public UpdateOrderException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
