package com.chunfeng.service.customizeException.user.select;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.ServiceException;

/**
 * 查询类异常
 * @author by 春风能解释
 * <p>
 * 2022/8/31
 */
public class SelectException extends ServiceException {
    public SelectException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
