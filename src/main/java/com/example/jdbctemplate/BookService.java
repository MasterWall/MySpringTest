package com.example.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cyx
 * @date 2020/12/18
 */

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void addBook(Book book){

        bookDao.add(book);

    }

}
