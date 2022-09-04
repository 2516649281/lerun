package com.chunfeng.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author by 春风能解释
 * <p>
 * 2022/9/4
 */
@Data
@Component
@ConfigurationProperties("utils.mysql")
public class UtilsMySQLConfig {

    /**
     * 数据库url
     */
    private List<String> url;

    /**
     * 用户名
     */
    private List<String> username;

    /**
     * 数据库驱动
     */
    private String driver;

    /**
     * 数据库密码
     */
    private List<String> password;
}
