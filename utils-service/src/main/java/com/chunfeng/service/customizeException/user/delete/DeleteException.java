package com.chunfeng.service.customizeException.user.delete;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.ServiceException;

/**
 * 删除类异常
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/31
 */
public class DeleteException extends ServiceException {
    public DeleteException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
