package com.example.ioc.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cyx
 * @date 2020/12/11
 */
public class SpringTest {

    public static void main(String[] args) {

    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Emp emp = context.getBean("axb", Emp.class);
        System.out.println(emp);
        emp.add();

        System.out.println("**************************");

        Emp emp1 = context.getBean("ccc", Emp.class);
        System.out.println(emp1);
        emp1.add();
    }
}
