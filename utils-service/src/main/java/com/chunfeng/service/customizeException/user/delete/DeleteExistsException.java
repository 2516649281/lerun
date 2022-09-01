package com.chunfeng.service.customizeException.user.delete;

import com.chunfeng.service.customizeException.ServiceEnum;

/**
 * 删除数据时数据不存在
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/31
 */
public class DeleteExistsException extends DeleteException {
    public DeleteExistsException(ServiceEnum serviceEnum) {
        super(serviceEnum);
    }
}
