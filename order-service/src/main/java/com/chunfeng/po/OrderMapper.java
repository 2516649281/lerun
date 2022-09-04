package com.chunfeng.po;

import com.chunfeng.domain.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 订单服务数据层接口
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/3
 */
public interface OrderMapper {

    /**
     * 查询所有订单
     *
     * @return 服务订单列表
     */
    List<Order> selectAll();

    /**
     * 根据用户编号查询订单
     *
     * @param userId 用户编号
     * @return 服务订单列表
     */
    List<Order> selectOrderByUserId(Long userId);

    /**
     * 根据支付订单id值查询订单
     *
     * @param payId 支付订单id值
     * @return 服务订单列表
     */
    List<Order> selectOrderByPayId(Long payId);

    /**
     * 根据id值批量查询订单
     *
     * @param orderIds 订单id值
     * @return 服务订单列表
     */
    List<Order> selectOrderById(@Param("orderIds") Long[] orderIds);

    /**
     * 添加一个订单
     *
     * @param order 订单信息
     * @return 影响行数
     */
    Integer insertOrder(Order order);

    /**
     * 批量修改订单
     *
     * @param orders 待修改的订单信息
     * @return 影响行数
     */
    Integer updateOrderById(@Param("orders") List<Order> orders);

    /**
     * 批量删除订单
     *
     * @param orderIds 订单编号
     * @return 影响行数
     */
    Integer deleteOrderById(@Param("orderIds") Long[] orderIds);
}
