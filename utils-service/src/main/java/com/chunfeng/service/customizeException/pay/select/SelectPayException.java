package com.chunfeng.service.customizeException.pay.select;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.pay.PayException;

/**
 * 查询类异常超类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/1
 */
public class SelectPayException extends PayException {

    public SelectPayException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
