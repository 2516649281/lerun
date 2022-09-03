package com.chunfeng;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 订单服务模块启动类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/1
 */
@SpringBootApplication
@Slf4j
public class OrderServiceApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(OrderServiceApplication.class);
        log.info(app+":订单服务模块启动完成!");
    }
}
