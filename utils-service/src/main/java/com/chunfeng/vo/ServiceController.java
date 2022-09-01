package com.chunfeng.vo;

import com.chunfeng.domain.JsonRequest;
import com.chunfeng.service.customizeException.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by 春风能解释
 * <p>
 * 2022/9/1
 */
@RestController
@Slf4j
public class ServiceController {

    @ExceptionHandler
    public JsonRequest<Void> getException(ServiceException e) {
        log.info("捕获到异常:" + e.getMessage());
        return new JsonRequest<>(e.serviceEnum.getStatus(), e.serviceEnum.getMessage());
    }
}
