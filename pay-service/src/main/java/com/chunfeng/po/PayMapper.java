package com.chunfeng.po;

import com.chunfeng.domain.Pay;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 支付功能的数据层接口
 *
 * @author by 春风能解释
 * <p>
 * 2022/9/1
 */
public interface PayMapper {

    /**
     * 查询所有支付的账单
     *
     * @return 支付的账单
     */
    List<Pay> selectAllPay();

    /**
     * 根据id值查询支付的账单
     *
     * @param payIds 支付账单id
     * @return 支付的账单
     */
    List<Pay> selectById(@Param("payIds") Long[] payIds);

    /**
     * 根据用户id值查询
     *
     * @param userId 用户id
     * @return 支付的账单
     */
    List<Pay> selectByUserId(Long userId);

    /**
     * 添加支付账单
     *
     * @param pay 支付账单
     * @return 影响行数
     */
    Integer insertPay(Pay pay);

    /**
     * 根据id值批量修改支付账单
     *
     * @param pays 待修改的支付账单
     * @return 影响行数
     */
    Integer updatePayById(@Param("pays") List<Pay> pays);

    /**
     * 根据id值批量删除支付账单
     *
     * @param ids 待删除的支付id
     * @return 影响行数
     */
    Integer deletePayById(@Param("ids") Long[] ids);
}
