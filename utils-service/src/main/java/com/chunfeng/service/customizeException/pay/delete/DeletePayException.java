package com.chunfeng.service.customizeException.pay.delete;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.pay.PayException;

/**
 * 删除支付订单类异常超类
 * @author by 春风能解释
 * <p>
 * 2022/9/2
 */
public class DeletePayException extends PayException {
    public DeletePayException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
