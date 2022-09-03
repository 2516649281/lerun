package com.chunfeng.service.customizeException.pay.insert;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.pay.PayException;

/**
 * 添加支付订单类异常超类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/1
 */
public class InsertPayException extends PayException {
    public InsertPayException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
