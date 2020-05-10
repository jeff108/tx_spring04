package cn.tx.test;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * 拓薪教育 -- 腾讯课程认证机构
 * 樱木老师
 */
public class Demo1 {

    /**
     * 使用new对象方式完成
     */
    @Test
    public void run1(){
        // 创建连接池对象，Spring框架内置了连接池对象
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        // 设置4个参数
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///spring_db");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        // 提供模板，创建对象
        JdbcTemplate template = new JdbcTemplate(dataSource);
        // 完成数据的增删改查
        template.update("insert into account values (null,?,?)","熊大",1000);
    }

}
















