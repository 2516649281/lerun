package com.chunfeng.service.customizeException.user.update;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 修改失败异常
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/31
 */
public class UpdateErrorException extends UpdateException {
    public UpdateErrorException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
