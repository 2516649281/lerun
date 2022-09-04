package com.chunfeng.service.customizeException.order.select;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 查询订单的结果为空
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/3
 */
public class SelectOrderNotExistsException extends SelectOrderException {
    public SelectOrderNotExistsException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
