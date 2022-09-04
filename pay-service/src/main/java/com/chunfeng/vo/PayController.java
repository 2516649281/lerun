package com.chunfeng.vo;

import com.chunfeng.domain.JsonRequest;
import com.chunfeng.domain.Pay;
import com.chunfeng.service.IPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 支付服务控制类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/2
 */
@RestController
@RequestMapping("/pay")
public class PayController {

    /**
     * 支付订单业务层
     */
    @Autowired
    private IPayService payService;


    /**
     * 查询所有支付订单
     *
     * @return JSON
     */
    @GetMapping("/select")
    public JsonRequest<List<Pay>> selectAll() {
        return payService.selectAll();
    }

    /**
     * 根据id值查询支付订单
     *
     * @param payIds 支付订单id值
     * @return JSON
     */
    @GetMapping("/selectI")
    public JsonRequest<List<Pay>> selectPayById(@RequestParam("payIds") Long[] payIds) {
        return payService.selectPayById(payIds);
    }

    /**
     * 根据用户id值查询支付订单
     *
     * @param userId 用户id值
     * @return JSON
     */
    @GetMapping("/select/{userId}")
    public JsonRequest<List<Pay>> selectPayByUserId(@PathVariable Long userId) {
        return payService.selectPayByUserId(userId);
    }

    /**
     * 添加支付订单
     *
     * @param pay 支付订单
     * @return JSON
     */
    @PostMapping("/insert")
    public JsonRequest<Integer> insertPay(@RequestBody Pay pay) {
        return payService.insertPay(pay);
    }

    /**
     * 根据支付id值修改账单
     *
     * @param pays 待修改的支付账单
     * @return JSON
     */
    @PutMapping("/update")
    public JsonRequest<Integer> updatePayById(@RequestBody List<Pay> pays) {
        return payService.updatePayById(pays);
    }

    /**
     * 根据id值批量删除支付订单
     *
     * @param payIds 待删除的支付订单id值
     * @return JSON
     */
    @DeleteMapping("/delete")
    public JsonRequest<Integer> deletePayById(@RequestBody Long[] payIds) {
        return payService.deletePayById(payIds);
    }
}
