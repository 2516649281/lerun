package com.chunfeng.service.customizeException.order.insert;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 添加订单时出现错误
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/3
 */
public class InsertOrderErrorException extends InsertOrderException {
    public InsertOrderErrorException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
