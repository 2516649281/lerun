package com.chunfeng.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户服务实体类
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    /**
     * 用户编号
     */
    private Long userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户头像
     */
    private String userAvatar;
    /**
     * 用户身份(0普通用户,1跑腿员,2管理员)
     */
    private Integer userIdentity;
    /**
     * 用户状态(0正常,1冻结)
     */
    private Integer userStatus;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 修改时间
     */
    private String updateTime;

    public User(String userName, String userPassword, String createTime, String updateTime) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public User(Long userId, String userName, String userPassword, String userAvatar, Integer userIdentity, Integer userStatus, String updateTime) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userAvatar = userAvatar;
        this.userIdentity = userIdentity;
        this.userStatus = userStatus;
        this.updateTime = updateTime;
    }

    public User(Long userId, String userName, String userPassword, String updateTime) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.updateTime = updateTime;
    }

    public User(String userName, String userPassword, String updateTime) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.updateTime = updateTime;
    }
}
