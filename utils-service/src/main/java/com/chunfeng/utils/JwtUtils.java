package com.chunfeng.utils;

import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.user.login.UserPasswordErrorException;
import io.jsonwebtoken.*;

import java.util.Date;
import java.util.UUID;

/**
 * Jwt工具类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/2
 */
public class JwtUtils<T> {

    /**
     * 过期时间
     * 设置15min过期
     */
    private final long time = 1000 * 60 * 60 * 2;

    /**
     * 密钥
     */
    private final String signature = "chunfeng@2516649281$";

    /**
     * 创建token的方法
     *
     * @param t 任意类型
     * @return token
     */
    public String createToken(T t) {
        JwtBuilder jwtBuilder = Jwts.builder();
        return jwtBuilder
                //header
                .setHeaderParam("typ", "JWT")
                .setHeaderParam("alg", "HS256")
                //payload
                .claim("user", t)
                .setSubject("admin-test")
                .setExpiration(new Date(System.currentTimeMillis() + time))
                .setId(UUID.randomUUID().toString())
                //signature
                .signWith(SignatureAlgorithm.HS256, signature)
                .compact();
    }

    /**
     * 校验token，布尔类型
     *
     * @param token token
     * @return object
     */
    public Object checkToken(String token) {
        if (token.equals("")) {
            throw new UserPasswordErrorException(ServiceEnum.USER_PASSWORD_ERROR);
        }
        Jws<Claims> claimsJws = Jwts.parser().setSigningKey(signature).parseClaimsJws(token);
        if (claimsJws == null) {
            throw new UserPasswordErrorException(ServiceEnum.USER_PASSWORD_ERROR);
        }
        return claimsJws.getBody().get("user");
    }
}
