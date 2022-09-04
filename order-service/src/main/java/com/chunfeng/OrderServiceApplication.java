package com.chunfeng;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 订单服务模块启动类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/1
 */
@SpringBootApplication
@MapperScan({"com.chunfeng.po"})
@EnableCaching
@EnableFeignClients
@Slf4j
public class OrderServiceApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(OrderServiceApplication.class);
        log.info(app+":订单服务模块启动完成!");
    }
}
