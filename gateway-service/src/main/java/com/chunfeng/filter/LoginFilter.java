package com.chunfeng.filter;

import com.alibaba.fastjson.JSON;
import com.chunfeng.config.FilterConfig;
import com.chunfeng.domain.User;
import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.user.login.UserNotLoginException;
import com.chunfeng.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.data.redis.core.RedisTemplate;
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
@Slf4j
public class LoginFilter extends ServiceFilter {

    /**
     * 配置键配置类
     */
    @Resource
    private FilterConfig filterConfig;

    /**
     * redis客户端
     */
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

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
                log.info("拦截器无条件放行!");
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
            log.warn("拦截器已拦截非法请求!");
            throw new UserNotLoginException(ServiceEnum.USER_NOT_LOGIN);
        }
        //解析token
        Object object = new JwtUtils<User>().checkToken(tokens.get(0));
        //转换成实体对象
        User user = JSON.parseObject(JSON.toJSONString(object), User.class);
        //获取redis中的token
        String token = redisTemplate.opsForValue().get("user_login::" + user.getUserName());
        //比较redis中的token与请求头中的是否一致
        if (token == null || token.equals(tokens.get(0))) {
            log.warn("拦截器已拦截非法请求!");
            throw new UserNotLoginException(ServiceEnum.USER_NOT_LOGIN);
        }
        log.info("拦截器已放行!");
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
