package com.chunfeng.service.customizeException.pay.update;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 修改支付订单时出现错误
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/2
 */
public class UpdatePayErrorException extends UpdatePayException {
    public UpdatePayErrorException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
