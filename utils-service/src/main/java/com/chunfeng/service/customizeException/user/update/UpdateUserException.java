package com.chunfeng.service.customizeException.user.update;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.user.UserException;

/**
 * 修改异常
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/31
 */
public class UpdateUserException extends UserException {

    public UpdateUserException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
