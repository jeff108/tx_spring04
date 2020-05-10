package cn.tx.test;

import cn.tx.demo1.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext_jdbc.xml")
public class Demo1_1 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 测试的方式
     */
    @Test
    public void run1(){
        jdbcTemplate.update("insert into account values (null,?,?)","熊四",800);
    }

    /**
     * 修改
     */
    @Test
    public void run2(){
        jdbcTemplate.update("update account set name = ?,money = ? where id = ?","光头强",100,7);
    }

    /**
     * 删除
     */
    @Test
    public void run3(){
        jdbcTemplate.update("delete from account where id = ?",7);
    }

    /**
     * 通过id查询
     */
    @Test
    public void run4(){
        Account account = jdbcTemplate.queryForObject("select * from account where id = ?", new BeanMapper(), 6);
        System.out.println(account);
    }

    /**
     * 查询所有的数据
     */
    @Test
    public void run5(){
        List<Account> list = jdbcTemplate.query("select * from account", new BeanMapper());
        for (Account account : list) {
            System.out.println(account);
        }
    }

}

/**
 * 实现类，用来进行数据封装的
 */
class BeanMapper implements RowMapper<Account>{

    /**
     * 是一行一行进行数据封装的
     * @param resultSet
     * @param i
     * @return
     * @throws SQLException
     */
    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();
        account.setId(resultSet.getInt("id"));
        account.setName(resultSet.getString("name"));
        account.setMoney(resultSet.getDouble("money"));
        return account;
    }

}