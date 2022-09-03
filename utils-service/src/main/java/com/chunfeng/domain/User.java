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
    private Long userId;//用户编号
    private String userName;//用户名
    private String userPassword;//用户密码
    private String userAvatar;//用户头像
    private Integer userIdentity;//用户身份(0普通用户,1跑腿员,2管理员)
    private Integer userStatus;//用户状态(0正常,1冻结)
    private String createTime;//创建时间
    private String updateTime;//修改时间

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
}
