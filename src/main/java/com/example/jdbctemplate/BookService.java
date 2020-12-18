package com.example.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cyx
 * @date 2020/12/18
 */

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    // 增加的方法
    public void addBook(Book book){
        bookDao.add(book);
    }

    // 修改的方法
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    // 删除的方法
    public void deleteBook(String id){
        bookDao.deleteBook(id);
    }

    // 查询表记录
    public int findCount(){
        return bookDao.selectCount();
    }

    // 查询返回对象
    public Book findOne(String id){
        return bookDao.findBookinfo(id);
    }

    // 查询返回集合
    public static List<Book> findAll(){
        return bookDao.findAllBook();
    }

}
