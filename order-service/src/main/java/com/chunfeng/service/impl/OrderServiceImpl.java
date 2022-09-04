package com.chunfeng.service.impl;

import com.chunfeng.domain.JsonRequest;
import com.chunfeng.domain.Order;
import com.chunfeng.domain.Pay;
import com.chunfeng.domain.User;
import com.chunfeng.po.OrderMapper;
import com.chunfeng.service.IOrderService;
import com.chunfeng.service.IPayFeignClient;
import com.chunfeng.service.IUserFeignClient;
import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.order.delete.DeleteOrderErrorException;
import com.chunfeng.service.customizeException.order.delete.DeleteOrderNotExistsException;
import com.chunfeng.service.customizeException.order.insert.InsertOrderErrorException;
import com.chunfeng.service.customizeException.order.select.SelectOrderException;
import com.chunfeng.service.customizeException.order.select.SelectOrderNotExistsException;
import com.chunfeng.service.customizeException.order.update.UpdateOrderErrorException;
import com.chunfeng.service.customizeException.pay.update.UpdatePayNotExistsException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 订单服务业务层实现类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/3
 */
@Service
@Transactional
@Slf4j
public class OrderServiceImpl implements IOrderService {

    /**
     * 订单数据层接口
     */
    @Autowired
    private OrderMapper orderMapper;

    /**
     * 支付服务远程调用
     */
    @Autowired
    private IPayFeignClient payFeignClient;

    /**
     * 用户服务远程调用
     */
    @Autowired
    private IUserFeignClient userFeignClient;

    @Value("${order.timeFormat}")
    private String timeFormat;

    /**
     * 查询所有订单
     *
     * @return JSON
     */
    @Override
    @Cacheable(value = "orders")
    public JsonRequest<List<Order>> selectAllOrder() {
        //先查询
        List<Order> orderList = orderMapper.selectAll();
        return getPayAndUser(orderList);
    }

    /**
     * 根据用户id值查询订单
     *
     * @param userId 用户id
     * @return JSON
     */
    @Override
    @Cacheable(value = "orders_uid", key = "#userId")
    public JsonRequest<List<Order>> selectOrderByUserId(Long userId) {
        List<Order> orders = orderMapper.selectOrderByUserId(userId);
        return getPayAndUser(orders);
    }

    /**
     * 根据支付订单id值查询服务订单
     *
     * @param payId 支付订单id
     * @return JSON
     */
    @Override
    @Cacheable(value = "orders_pid", key = "#payId")
    public JsonRequest<List<Order>> selectOrderByPayId(Long payId) {
        List<Order> orders = orderMapper.selectOrderByPayId(payId);
        return getPayAndUser(orders);
    }

    /**
     * 根据id值批量查询订单
     *
     * @param orderIds 订单id值
     * @return JSON
     */
    @Override
    @Cacheable(value = "orders_id")
    public JsonRequest<List<Order>> selectOrderById(Long[] orderIds) {
        List<Order> orders = orderMapper.selectOrderById(orderIds);
        if (orders.isEmpty()) {
            throw new SelectOrderNotExistsException(ServiceEnum.SELECT_ORDER_NOT_EXISTS);
        }
        return new JsonRequest<>(orders);
    }

    /**
     * 添加一条订单
     *
     * @param order 订单信息
     * @return JSON
     */
    @Override
    @CacheEvict(value = {"orders", "orders_uid", "orders_pid", "orders_id"}, allEntries = true)
    public JsonRequest<Integer> insertOrder(Order order) {
        //创建时间
        order.setPlaceTime(new SimpleDateFormat(timeFormat).format(new Date()));
        Integer column = orderMapper.insertOrder(order);
        if (column < 1) {
            throw new InsertOrderErrorException(ServiceEnum.INSERT_ORDER_ERROR);
        }
        log.info("订单" + order.getOrderId() + "已添加!");
        return new JsonRequest<>(column);
    }

    /**
     * 根据id值批量修改订单
     *
     * @param orders 待修改的订单信息
     * @return JSON
     */
    @Override
    @CacheEvict(value = {"orders", "orders_uid", "orders_pid", "orders_id"}, allEntries = true)
    public JsonRequest<Integer> updateOrderById(List<Order> orders) {
        Long[] orderIds = new Long[orders.size()];
        //提取订单的id值
        for (int i = 0; i < orders.size(); i++) {
            orderIds[i] = orders.get(i).getOrderId();
            //填充修改时间
            orders.get(i).setTakeTime(new SimpleDateFormat(timeFormat).format(new Date()));
        }
        //查询
        List<Order> orderSelect = orderMapper.selectOrderById(orderIds);
        //判断数据完整性
        if (orderSelect.size() < orders.size()) {
            throw new UpdatePayNotExistsException(ServiceEnum.UPDATE_ORDER_NOT_EXISTS);
        }
        Integer column = orderMapper.updateOrderById(orders);
        //分析修改结果
        if (column < orders.size()) {
            throw new UpdateOrderErrorException(ServiceEnum.UPDATE_ORDER_ERROR);
        }
        log.info(orders.size() + "条订单已修改!");
        return new JsonRequest<>(column);
    }

    /**
     * 根据id值批量删除订单
     *
     * @param orderIds 待删除的订单id
     * @return JSON
     */
    @Override
    @CacheEvict(value = {"orders", "orders_uid", "orders_pid", "orders_id"}, allEntries = true)
    public JsonRequest<Integer> deleteOrderById(Long[] orderIds) {
        //查询
        List<Order> orderSelect = orderMapper.selectOrderById(orderIds);
        //判断数据完整性
        if (orderSelect.size() < orderIds.length) {
            throw new DeleteOrderNotExistsException(ServiceEnum.DELETE_ORDER_NOT_EXISTS);
        }
        Integer column = orderMapper.deleteOrderById(orderIds);
        //分析删除结果
        if (column < orderIds.length) {
            throw new DeleteOrderErrorException(ServiceEnum.DELETE_ORDER_ERROR);
        }
        log.warn(orderIds.length + "条订单已被永久删除!");
        return new JsonRequest<>(column);
    }

    /**
     * 校验数据的方法
     *
     * @param orderList 订单结果
     * @return JSON
     */
    public JsonRequest<List<Order>> getPayAndUser(List<Order> orderList) {
        if (orderList.isEmpty()) {
            throw new SelectOrderException(ServiceEnum.SELECT_ORDER_NOT_EXISTS);
        }
        //用户id
        Long[] userIds = new Long[orderList.size()];
        //支付id
        Long[] payIds = new Long[orderList.size()];
        //提取从中的id值
        for (int i = 0; i < orderList.size(); i++) {
            userIds[i] = orderList.get(i).getUserId();
            payIds[i] = orderList.get(i).getPayId();
        }
        //查询对应的数据
        List<User> userSelect = userFeignClient.selectUserById(userIds).getData();
        List<Pay> paySelect = payFeignClient.selectPayById(payIds).getData();
        //填充数据
        for (int i = 0; i < orderList.size(); i++) {
            orderList.get(i).setUser(userSelect.get(i));
            orderList.get(i).setPay(paySelect.get(i));
        }
        log.info("已查询到" + orderList.size() + "条订单");
        return new JsonRequest<>(orderList);
    }
}
