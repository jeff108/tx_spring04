package cn.tx.demo2;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
public class AccountDaoImpl implements AccountDao {

    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

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
