package cn.tx.demo5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 付款
     * @param out
     * @param money
     */
    @Override
    public void outMoney(String out, double money) {
        jdbcTemplate.update("update account set money = money - ? where name = ?",money,out);
    }

    /**
     * 收款
     * @param in
     * @param money
     */
    @Override
    public void inMoney(String in, double money) {
        jdbcTemplate.update("update account set money = money + ? where name = ?",money,in);
    }

}
