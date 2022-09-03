package com.chunfeng.service.customizeException.pay.insert;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 添加支付订单时出现错误
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/2
 */
public class InsertPayErrorException extends InsertPayException {
    public InsertPayErrorException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
