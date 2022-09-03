package com.chunfeng;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 支付服务模块启动类
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
public class PayApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(PayApplication.class);
        log.info(app + ":支付服务端启动成功!");
    }
}
