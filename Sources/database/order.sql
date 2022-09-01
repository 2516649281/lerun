CREATE DATABASE lerun_order;
USE lerun_order;
CREATE TABLE `order`
(
    order_id     BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '订单编号',
    order_name   VARCHAR(1024) NOT NULL COMMENT '订单名称',
    order_status INT           NOT NULL DEFAULT 0 COMMENT '订单状态(0未接单,1已接单,2已完成,3已退款)',
    pay_id       BIGINT COMMENT '支付编号',
    user_id      BIGINT COMMENT '用户编号',
    place_time   DATETIME      NOT NULL COMMENT '下单时间',
    take_time    DATETIME COMMENT '接单时间'
) COMMENT '订单表';