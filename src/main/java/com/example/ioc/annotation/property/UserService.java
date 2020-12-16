package com.example.ioc.annotation.property;

import org.springframework.stereotype.Service;

/**
 * @author cyx
 * @date 2020/12/14
 */

@Service(value = "userService")
public class UserService {
    public void add(){
        System.out.println("IOC原理——注解形式");
    }
}
