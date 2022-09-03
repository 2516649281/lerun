package com.chunfeng.po;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author by 春风能解释
 * <p>
 * 2022/9/1
 */
@SpringBootTest
public class PayMapperTest {

    @Autowired
    private PayMapper payMapper;

    @Test
    void test1() {
        System.out.println(payMapper.selectAllPay());
    }
}
