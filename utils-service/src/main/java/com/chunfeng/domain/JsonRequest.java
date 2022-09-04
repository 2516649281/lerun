package com.chunfeng.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * JSON响应类
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonRequest<T> implements Serializable {
    /**
     * 状态码
     */
    private Integer status = 200;
    /**
     * 消息
     */
    private String message = "请求已完成!";
    /**
     * 数据
     */
    private T data;

    public JsonRequest(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public JsonRequest(Integer status, T data) {
        this.status = status;
        this.data = data;
    }

    public JsonRequest(T data) {
        this.data = data;
    }
}
