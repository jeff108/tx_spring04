package cn.tx.test;

import cn.tx.demo2.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext_dao1.xml")
public class Demo2 {

    @Autowired
    private AccountService accountService;

    /**
     * 测试转账的方法
     */
    @Test
    public void testPay(){
        accountService.pay("熊大","熊二",100);
    }

}
