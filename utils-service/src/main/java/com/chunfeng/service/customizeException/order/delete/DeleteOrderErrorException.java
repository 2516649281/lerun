package com.chunfeng.service.customizeException.order.delete;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.order.OrderException;

/**
 * 删除订单失败
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/3
 */
public class DeleteOrderErrorException extends OrderException {
    public DeleteOrderErrorException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
