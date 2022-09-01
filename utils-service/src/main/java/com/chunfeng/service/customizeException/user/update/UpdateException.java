package com.chunfeng.service.customizeException.user.update;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.ServiceException;

/**
 * 修改异常
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/31
 */
public class UpdateException extends ServiceException {

    public UpdateException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
