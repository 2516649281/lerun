package com.chunfeng.service.customizeException.pay.update;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 修改支付时数据不存在
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/2
 */
public class UpdatePayNotExistsException extends UpdatePayException {
    public UpdatePayNotExistsException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
