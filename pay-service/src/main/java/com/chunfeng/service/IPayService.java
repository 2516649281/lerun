package com.chunfeng.service;

import com.chunfeng.domain.JsonRequest;
import com.chunfeng.domain.Pay;

import java.util.List;

/**
 * 支付服务业务层接口
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/1
 */

public interface IPayService {

    /**
     * 查询所有支付订单
     *
     * @return JSON
     */
    JsonRequest<List<Pay>> selectAll();

    /**
     * 根据id值批量查询支付订单
     *
     * @param payId 支付订单id值
     * @return JSON
     */
    JsonRequest<List<Pay>> selectPayById(Long[] payId);

    /**
     * 根据用户id值查询支付订单
     *
     * @param userId 用户id值
     * @return JSON
     */
    JsonRequest<List<Pay>> selectPayByUserId(Long userId);

    /**
     * 添加支付订单
     *
     * @param pay 支付订单
     * @return JSON
     */
    JsonRequest<Integer> insertPay(Pay pay);

    /**
     * 根据支付id值修改账单
     *
     * @param pays 待修改的支付账单
     * @return JSON
     */
    JsonRequest<Integer> updatePayById(List<Pay> pays);

    /**
     * 根据id值批量删除支付订单
     *
     * @param payIds 待删除的支付订单id值
     * @return JSON
     */
    JsonRequest<Integer> deletePayById(Long[] payIds);
}
