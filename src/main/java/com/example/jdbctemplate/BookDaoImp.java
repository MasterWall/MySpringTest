package com.example.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core;

import java.util.List;

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

    @Override
    public void updateBook(Book book) {

        String sql = "update userinfo set username=?,ustatus=? where userId=?";
        Object[] args = {book.getUsername(), book.getUstatus(),book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);

    }

    @Override
    public void deleteBook(String id) {

        String sql = "delete from userinfo where userId=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);

    }

    @Override
    public int selectCount() {

        String sql = "select count(*) from userinfo";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public Book findBookinfo(String id) {
        String sql = "select * from userinfo where userId=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }


    @Override
    public List<Book> findAllBook() {
        String sql = "select * from userinfo";
        //调用方法
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }
}
