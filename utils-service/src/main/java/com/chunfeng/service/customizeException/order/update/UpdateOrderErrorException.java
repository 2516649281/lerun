package com.chunfeng.service.customizeException.order.update;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 修改订单时出现错误
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/3
 */
public class UpdateOrderErrorException extends UpdateOrderException {
    public UpdateOrderErrorException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
