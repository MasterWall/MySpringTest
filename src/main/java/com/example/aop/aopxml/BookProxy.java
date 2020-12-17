package com.example.aop.aopxml;

import org.springframework.stereotype.Component;

/**
 * @author cyx
 * @date 2020/12/17
 */

@Component
public class BookProxy {
    public void before() {
        System.out.println("before.........");
    }
}
