package com.chunfeng.service.customizeException.pay.delete;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 删除支付订单时出现错误
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/2
 */
public class DeletePayErrorException extends DeletePayException {
    public DeletePayErrorException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
