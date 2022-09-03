package com.chunfeng;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 用户服务模块启动类
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/30
 */
@SpringBootApplication
@EnableCaching
@MapperScan({"com.chunfeng.po"})
@Slf4j
public class UserServiceApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(UserServiceApplication.class);
        log.info(app + ":用户服务端启动完毕!");
    }
}
