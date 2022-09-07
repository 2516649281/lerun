package com.chunfeng;

import com.chunfeng.po.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 用户测试类
 *
 * @author by 春风能解释
 * <p>
 * 2022/8/30
 */
@SpringBootTest
public class daoTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void test1() {
        System.out.println(userMapper.selectAllUser());
    }
}
