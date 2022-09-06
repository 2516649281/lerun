package com.chunfeng;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 服务网关启动成功
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/2
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Slf4j
public class GatewayApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(GatewayApplication.class);
        log.info(app + ":服务网关启动成功!");
    }
}
