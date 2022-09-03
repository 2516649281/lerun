package com.chunfeng.service.customizeException.pay.select;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 查找支付账单不存在异常
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/1
 */
public class SelectPayNotExistsException extends SelectPayException {
    public SelectPayNotExistsException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
