package cn.tx.demo4;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    /**
     * 付款
     * @param out
     * @param money
     */
    @Override
    public void outMoney(String out, double money) {
        this.getJdbcTemplate().update("update account set money = money - ? where name = ?",money,out);
    }

    /**
     * 收款
     * @param in
     * @param money
     */
    @Override
    public void inMoney(String in, double money) {
        this.getJdbcTemplate().update("update account set money = money + ? where name = ?",money,in);
    }

}
