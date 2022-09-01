CREATE DATABASE lerun_pay;
USE lerun_pay;
CREATE TABLE pay
(
    pay_id      BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '支付编号',
    pay_money   VARCHAR(10)   NOT NULL COMMENT '支付价格',
    pay_type    VARCHAR(32)   NOT NULL COMMENT '支付方式',
    pay_status  INT DEFAULT 0 NOT NULL COMMENT '支付状态(0未支付,1已支付,2已退款)',
    user_id     BIGINT        NOT NULL COMMENT '用户编号',
    pay_time    DATETIME      NOT NULL COMMENT '支付时间',
    refund_time DATETIME COMMENT '退款时间'
) COMMENT '支付表';