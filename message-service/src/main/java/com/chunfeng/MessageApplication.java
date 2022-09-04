package com.chunfeng;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 消息服务模块启动类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/4
 */
@SpringBootApplication
@Slf4j
public class MessageApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(MessageApplication.class);
        log.info(app + ":消息服务模块启动成功!");
    }
}
