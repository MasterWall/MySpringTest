package com.example.ioc.annotation.dao;

import org.springframework.stereotype.Service;

/**
 * @author cyx
 * @date 2020/12/14
 */

@Service(value = "abc")
public class UserDaoImp implements UserDao {

    @Override
    public void add(){
        System.out.println("UserDaoImp实现UserDao接口并重写了add方法");
    }
}
