package com.chunfeng.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;

/**
 * 自定义键配置类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/2
 */
@Data
@Component
@ConfigurationProperties("filter")
public class FilterConfig {
    /**
     * 拦截器排除路径
     */
    private LinkedHashSet<String> excludePath;
}