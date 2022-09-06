package com.chunfeng.service.customizeException.pay.delete;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 删除支付订单类异常超类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/2
 */
public class DeletePayNotExistsException extends DeletePayException {
    public DeletePayNotExistsException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
