package com.example.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author cyx
 * @date 2020/12/18
 */

@Repository
public class BookDaoImp implements BookDao {

    // 注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 重写接口中的方法
    @Override
    public void add(Book book) {

        //1 创建sql语句，其中userinfo为sql表名
        String sql = "insert into userinfo values(?,?,?)";
        // 2 调用方法实现
        Object[] args = {book.getUserId(), book.getUsername(), book.getUstatus()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }
}
