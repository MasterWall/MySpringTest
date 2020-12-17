package com.example.aop.aopxml;

import org.springframework.stereotype.Component;

/**
 * @author cyx
 * @date 2020/12/17
 */

@Component
public class Book {
    public void buy() {
        System.out.println("buy.............");
    }
}
