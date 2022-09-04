package com.chunfeng.service;

import com.chunfeng.domain.JsonRequest;
import com.chunfeng.domain.Order;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * 订单服务业务层接口
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/3
 */
public interface IOrderService {

    /**
     * 查询所有订单
     *
     * @return JSON
     */
    JsonRequest<List<Order>> selectAllOrder();

    /**
     * 根据用户id值查询订单
     * @param userId 用户id
     * @return JSON
     */
    JsonRequest<List<Order>> selectOrderByUserId(Long userId);

    /**
     * 根据支付订单id值查询服务订单
     * @param payId 支付订单id
     * @return JSON
     */
    JsonRequest<List<Order>> selectOrderByPayId(Long payId);

    /**
     * 根据id值批量查询订单
     *
     * @param orderIds 订单id值
     * @return JSON
     */
    JsonRequest<List<Order>> selectOrderById(Long[] orderIds);

    /**
     * 添加一条订单
     * @param order 订单信息
     * @return JSON
     */
    JsonRequest<Integer> insertOrder(Order order);

    /**
     * 根据id值批量修改订单
     * @param orders 待修改的订单信息
     * @return JSON
     */
    JsonRequest<Integer> updateOrderById(List<Order> orders);

    /**
     * 根据id值批量删除订单
     * @param orderIds 待删除的订单id
     * @return JSON
     */
    JsonRequest<Integer> deleteOrderById(Long[] orderIds);
}
