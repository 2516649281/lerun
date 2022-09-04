package com.chunfeng.service.customizeException.order.delete;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 待删除的订单已经为空
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/3
 */
public class DeleteOrderNotExistsException extends DeleteOrderException {
    public DeleteOrderNotExistsException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
