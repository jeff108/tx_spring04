package cn.tx.demo5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
@Service
@Transactional(isolation = Isolation.DEFAULT)
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    /**
     * 转账方法
     * @param out       付款人
     * @param in        收款人
     * @param money     金额
     */
    @Override
    public void pay(String out, String in, double money) {
        // 调用dao方法
        accountDao.outMoney(out,money);

        // 模拟异常
        int a = 1/0;

        accountDao.inMoney(in,money);
    }

}
