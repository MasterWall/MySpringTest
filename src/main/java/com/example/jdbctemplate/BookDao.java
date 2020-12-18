package com.example.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author cyx
 * @date 2020/12/18
 */

public interface BookDao {

    // 接口中的方法声明，因为方法默认都为public，故public可省略
    public void add(Book book);
}
