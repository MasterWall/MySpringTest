package com.example.jdbctemplate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author cyx
 * @date 2020/12/18
 */
public class TestBook {

    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();

        // 给数据库传输数据
        book.setUserId("2");
        book.setUsername("javadoc");
        book.setUstatus("abc");
        bookService.addBook(book);

        // 给数据库更新数据
        book.setUserId("3");
        book.setUsername("python");
        book.setUstatus("axb");
        bookService.updateBook(book);

        // 删除数据库中的数据
        bookService.deleteBook("1");

        // 查询表中有几条记录
        int count = bookService.findCount();
        System.out.println("表中有几条记录:"+count+"条");

        // 查询返回对象
        Book one = bookService.findOne("3");
        System.out.println(one);

        // 查询返回集合
        List<Book> all = BookService.findAll();
        System.out.println(all);

    }
}
