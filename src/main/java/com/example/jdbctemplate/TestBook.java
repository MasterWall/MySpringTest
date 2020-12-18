package com.example.jdbctemplate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        book.setUserId("3");
        book.setUsername("javadoc");
        book.setUstatus("abc");
        bookService.addBook(book);
    }

}
