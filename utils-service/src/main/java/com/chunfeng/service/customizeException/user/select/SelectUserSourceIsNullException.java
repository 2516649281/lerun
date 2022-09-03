package com.chunfeng.service.customizeException.user.select;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 查询的数据为空
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/31
 */
public class SelectUserSourceIsNullException extends SelectUserException {
    public SelectUserSourceIsNullException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
