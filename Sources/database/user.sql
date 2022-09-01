CREATE DATABASE lerun_user;
USE lerun_user;
CREATE TABLE USER
(
    user_id       BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '用户编号',
    user_name     VARCHAR(32)  NOT NULL UNIQUE COMMENT '用户名',
    user_password VARCHAR(512) NOT NULL COMMENT '用户密码',
    user_avatar   VARCHAR(1024) COMMENT '头像',
    user_identity INT          not null DEFAULT 0 comment '用户身份(0普通用户,1跑腿员,2管理员)',
    user_status   INT                   DEFAULT 0 COMMENT '用户状态(0正常,1冻结)',
    create_time   DATETIME     NOT NULL COMMENT '创建时间',
    update_time   DATETIME COMMENT '修改时间'
) COMMENT '用户表';
