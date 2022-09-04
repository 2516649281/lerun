package com.chunfeng.service.customizeException.order.update;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 修改的订单已经存在
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/3
 */
public class UpdateOrderExistsException extends UpdateOrderException {
    public UpdateOrderExistsException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
