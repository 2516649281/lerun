package com.chunfeng.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 服务端口映射
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/4
 */
@Data
@Component
@ConfigurationProperties(prefix = "utils.server")
public class UtilsServerConfig {

    /**
     * 服务端口
     */
    private List<Integer> port;

    /**
     * 应用名称
     */
    private List<String> name;

    /**
     * 时间格式
     */
    private String format;
}
