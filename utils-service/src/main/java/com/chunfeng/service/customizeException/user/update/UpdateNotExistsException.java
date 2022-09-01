package com.chunfeng.service.customizeException.user.update;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 修该数据时数据不存在
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/31
 */
public class UpdateNotExistsException extends UpdateException {

    public UpdateNotExistsException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
