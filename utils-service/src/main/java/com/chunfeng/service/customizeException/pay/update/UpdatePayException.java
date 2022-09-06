package com.chunfeng.service.customizeException.pay.update;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.pay.PayException;

/**
 * 支付订单修改类异常超类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/2
 */
public class UpdatePayException extends PayException {
    public UpdatePayException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
