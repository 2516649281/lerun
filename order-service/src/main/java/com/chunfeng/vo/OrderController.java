package com.chunfeng.vo;

import com.chunfeng.domain.JsonRequest;
import com.chunfeng.domain.Order;
import com.chunfeng.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 订单服务控制层
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/3
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    /**
     * 订单业务层
     */
    @Autowired
    private IOrderService orderService;

    /**
     * 查询所有订单
     *
     * @return JSON
     */
    @GetMapping("/select")
    public JsonRequest<List<Order>> selectAllOrder() {
        return orderService.selectAllOrder();
    }

    /**
     * 根据用户id值查询订单
     *
     * @param userId 用户id
     * @return JSON
     */
    @GetMapping("/selectU/{userId}")
    public JsonRequest<List<Order>> selectOrderByUserId(@PathVariable Long userId) {
        return orderService.selectOrderByUserId(userId);
    }

    /**
     * 根据支付订单id值查询服务订单
     *
     * @param payId 支付订单id
     * @return JSON
     */
    @GetMapping("/selectP/{payId}")
    public JsonRequest<List<Order>> selectOrderByPayId(@PathVariable Long payId) {
        return orderService.selectOrderByPayId(payId);
    }

    /**
     * 根据id值批量查询订单
     *
     * @param orderIds 订单id值
     * @return JSON
     */
    @GetMapping("/selectI}")
    public JsonRequest<List<Order>> selectOrderById(@RequestParam("orderIds") Long[] orderIds) {
        return orderService.selectOrderById(orderIds);
    }

    /**
     * 添加一条订单
     *
     * @param order 订单信息
     * @return JSON
     */
    @PostMapping("/insert")
    public JsonRequest<Integer> insertOrder(@RequestBody Order order) {
        return orderService.insertOrder(order);
    }

    /**
     * 根据id值批量修改订单
     *
     * @param orders 待修改的订单信息
     * @return JSON
     */
    @PutMapping("/update")
    public JsonRequest<Integer> updateOrderById(@RequestBody List<Order> orders) {
        return orderService.updateOrderById(orders);
    }

    /**
     * 根据id值批量删除订单
     *
     * @param orderIds 待删除的订单id
     * @return JSON
     */
    @DeleteMapping("/delete")
    public JsonRequest<Integer> deleteOrderById(@RequestParam("orderIds") Long[] orderIds) {
        return orderService.deleteOrderById(orderIds);
    }
}
