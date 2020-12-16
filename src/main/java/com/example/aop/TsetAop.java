package com.example.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cyx
 * @date 2020/12/16
 */
public class TsetAop {

    @Test
    public void testAopAnno() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

}
