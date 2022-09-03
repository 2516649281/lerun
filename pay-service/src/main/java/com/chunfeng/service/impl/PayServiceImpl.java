package com.chunfeng.service.impl;

import com.chunfeng.domain.JsonRequest;
import com.chunfeng.domain.Pay;
import com.chunfeng.domain.User;
import com.chunfeng.po.PayMapper;
import com.chunfeng.service.IPayFeignClient;
import com.chunfeng.service.IPayService;
import com.chunfeng.service.customizeException.ServiceEnum;
import com.chunfeng.service.customizeException.pay.delete.DeletePayErrorException;
import com.chunfeng.service.customizeException.pay.delete.DeletePayNotExistsException;
import com.chunfeng.service.customizeException.pay.insert.InsertPayErrorException;
import com.chunfeng.service.customizeException.pay.select.SelectPayNotExistsException;
import com.chunfeng.service.customizeException.pay.update.UpdatePayErrorException;
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
 * 支付服务业务层实现类
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/1
 */
@Service
@Transactional
@Slf4j
public class PayServiceImpl implements IPayService {

    /**
     * 支付服务的数据层接口
     */
    @Autowired
    private PayMapper payMapper;

    /**
     * 支付远程操作接口
     */
    @Autowired
    private IPayFeignClient payFeignClient;

    @Value("${pay.timeFormat}")
    private String timeFormat;

    /**
     * 查询所有支付订单
     *
     * @return JSON
     */
    @Cacheable(value = "pays")
    @Override
    public JsonRequest<List<Pay>> selectAll() {
        List<Pay> pays = payMapper.selectAllPay();
        return getListJsonRequest(pays);
    }

    /**
     * 根据id值查询支付订单
     *
     * @param payIds 支付订单id值
     * @return JSON
     */
    @Override
    @Cacheable(value = "pays_id")
    public JsonRequest<List<Pay>> selectPayById(Long[] payIds) {
        List<Pay> pays = payMapper.selectById(payIds);
        return getListJsonRequest(pays);
    }

    /**
     * 根据用户id值查询支付订单
     *
     * @param userId 用户id值
     * @return JSON
     */
    @Override
    @Cacheable(value = "pays_uid", key = "#userId")
    public JsonRequest<List<Pay>> selectPayByUserId(Long userId) {
        List<Pay> pays = payMapper.selectByUserId(userId);
        return getListJsonRequest(pays);
    }

    /**
     * 添加支付订单
     *
     * @param pay 支付订单
     * @return JSON
     */
    @CacheEvict(value = {"pays", "pays_id", "pays_uid"}, allEntries = true)
    @Override
    public JsonRequest<Integer> insertPay(Pay pay) {
        //设置创建时间
        pay.setPayTime(new SimpleDateFormat(timeFormat).format(new Date()));
        Integer column = payMapper.insertPay(pay);
        if (column < 1) {
            throw new InsertPayErrorException(ServiceEnum.INSERT_PAY_ERROR);
        }
        log.info("支付订单号:" + pay.getPayId() + "创建完成");
        return new JsonRequest<>(column);
    }

    /**
     * 根据支付id值修改账单
     *
     * @param pays 待修改的支付账单
     * @return JSON
     */
    @Override
    @CacheEvict(value = {"pays", "pays_id", "pays_uid"}, allEntries = true)
    public JsonRequest<Integer> updatePayById(List<Pay> pays) {
        Long[] payIds = new Long[pays.size()];
        for (int i = 0; i < pays.size(); i++) {
            payIds[i] = pays.get(i).getPayId();
            //输出修改时间
            pays.get(i).setRefundTime(new SimpleDateFormat(timeFormat).format(new Date()));
        }
        List<Pay> payList = payMapper.selectById(payIds);
        if (payList.isEmpty()) {
            throw new UpdatePayNotExistsException(ServiceEnum.UPDATE_PAY_NOT_EXISTS);
        }
        Integer column = payMapper.updatePayById(pays);
        if (column < pays.size()) {
            throw new UpdatePayErrorException(ServiceEnum.UPDATE_PAY_ERROR);
        }
        return new JsonRequest<>(column);
    }

    /**
     * 根据id值批量删除支付订单
     *
     * @param payIds 待删除的支付订单id值
     * @return JSON
     */
    @Override
    @CacheEvict(value = {"pays", "pays_id", "pays_uid"}, allEntries = true)
    public JsonRequest<Integer> deletePayById(Long[] payIds) {
        //查找是否存在
        List<Pay> payList = payMapper.selectById(payIds);
        if (payList.isEmpty()) {
            throw new DeletePayNotExistsException(ServiceEnum.DELETE_PAY_NOT_EXISTS);
        }
        Integer column = payMapper.deletePayById(payIds);
        if (column < payIds.length) {
            throw new DeletePayErrorException(ServiceEnum.DELETE_PAY_ERROR);
        }
        return new JsonRequest<>(column);
    }

    /**
     * 查询后校验数据的方法
     *
     * @param pays 支付订单
     * @return JSON
     */
    public JsonRequest<List<Pay>> getListJsonRequest(List<Pay> pays) {
        if (pays.isEmpty()) {
            throw new SelectPayNotExistsException(ServiceEnum.SELECT_PAY_NOT_EXISTS);
        }
        Long[] userIds = new Long[pays.size()];
        //提取用户的id值
        for (int i = 0; i < pays.size(); i++) {
            userIds[i] = pays.get(i).getUserId();
        }
        //查询用户
        List<User> users = payFeignClient.selectUserById(userIds).getData();
        if (users.isEmpty()) {
            throw new SelectPayNotExistsException(ServiceEnum.SELECT_PAY_NOT_EXISTS);
        }
        //组合数据
        for (int i = 0; i < pays.size(); i++) {
            pays.get(i).setUser(users.get(i));
        }
        log.info("已查询到" + pays.size() + "条支付数据");
        return new JsonRequest<>(pays);
    }
}
