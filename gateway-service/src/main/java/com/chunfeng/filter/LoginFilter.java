package com.chunfeng.filter;

import com.alibaba.fastjson.JSON;
import com.chunfeng.config.FilterConfig;
import com.chunfeng.domain.User;
import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.user.login.UserNotLoginException;
import com.chunfeng.utils.JwtUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;
import java.util.List;

/**
 * 登录拦截器
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/2
 */
@Component
public class LoginFilter extends ServiceFilter {

    @Resource
    private FilterConfig filterConfig;

    /**
     * 拦截器
     *
     * @param exchange 数据
     * @param chain    过滤
     * @return 处理结果
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        ServerHttpRequest request = exchange.getRequest();

        //排除指定的请求路径
        String path = request.getURI().getPath();
        for (String url : filterConfig.getExcludePath()) {
            if (path.equals(url)) {
                return chain.filter(exchange);
            }
        }

        /*
            放行预处理请求
            if (request.getMethod().matches("OPTIONS")) {
                return chain.filter(exchange);
            }
        */

        //读取请求头的token
        HttpHeaders headers = request.getHeaders();
        //获取token
        List<String> tokens = headers.get("token");
        //判断请求头是否携带token
        if (tokens == null || tokens.isEmpty()) {
            throw new UserNotLoginException(ServiceEnum.USER_NOT_LOGIN);
        }
        //解析token
        Object object = new JwtUtils<User>().checkToken(tokens.get(0));
        //转换成实体对象
        User user = JSON.parseObject(JSON.toJSONString(object), User.class);
        if (user.getUserId() == null) {
            throw new UserNotLoginException(ServiceEnum.USER_NOT_LOGIN);
        }
        return chain.filter(exchange);
    }

    /**
     * 拦截器优先级级
     *
     * @return 等级, 数字越小优先级越高
     */
    @Override
    public int getOrder() {
        return 1;
    }
}
