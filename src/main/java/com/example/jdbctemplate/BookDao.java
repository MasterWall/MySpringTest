package com.example.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author cyx
 * @date 2020/12/18
 */

public interface BookDao {

    // 接口中的方法声明，因为方法默认都为public，故public可省略
    public void add(Book book);


    // 修改的方法
    void updateBook(Book book);


    // 删除的方法
    void deleteBook(String id);

    // 查询表记录
    int selectCount();

    // 查询返回对象
    Book findBookinfo(String id);

    // 查询返回集合
    List<Book> findAllBook();
}
