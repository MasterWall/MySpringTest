package com.example.aop.aopxml;

import org.springframework.stereotype.Component;

/**
 * @author cyx
 * @date 2020/12/16
 */

// 被增强类
@Component
public class User {
    public void add(){
        System.out.println("add................");
    }
}
