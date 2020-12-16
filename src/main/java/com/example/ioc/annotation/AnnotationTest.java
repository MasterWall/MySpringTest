package com.example.ioc.annotation;
import com.example.ioc.annotation.config.TotalAnnotation;
import com.example.ioc.annotation.property.AnnotationProperty;
import com.example.ioc.annotation.property.UserService;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cyx
 * @date 2020/12/14
 */
public class AnnotationTest {

    @Test
    public void testService(){

        // 加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        // 创建对象
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);

        // 方法调用
        userService.add();

    }


    @Test
    public void testAnnotationProperty(){

        // 完全注解方法，不用创建xml文件，注意TotalAnnotation文件下的@ComponentScan中包的路径
        ApplicationContext context = new AnnotationConfigApplicationContext(TotalAnnotation.class);

        // 创建对象
        AnnotationProperty annotationProperty = context.getBean("annotationProperty", AnnotationProperty.class);
        System.out.println(annotationProperty);

        // 方法调用
        annotationProperty.add();

    }

}
