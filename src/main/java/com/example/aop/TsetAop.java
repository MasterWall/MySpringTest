package com.example.aop;

import com.example.aop.aopannotation.Config;
import com.example.aop.aopxml.Book;
import com.example.aop.aopxml.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        System.out.println("xml配置与注解混用方式");
        System.out.println("****************************");

        // 基于xml配置方式，在UserProxy类中提供了@Aspect注解生成代理对象
        // 在UserProxy类中通过@After(value = "execution(public * com.example.aop.aopxml.User.add(..))")注解生成通知方法进行增强
        // 故在这里调用user.add()会增强方法，运行后会出现不止一个add()方法，而是会出现多个通知方法
        user.add();
    }

    @Test
   public void testAop(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        User user = context.getBean("user", User.class);
        System.out.println("完全注解方式");
        System.out.println("****************************");

        // 基于完全注解方式，在Config类中提供了@EnableAspectJAutoProxy(proxyTargetClass = true)生成代理对象
        // 在UserProxy类中通过@Pointcut(value = "execution(public * com.example.aop.aopxml.User.add(..))")注解和
        // @Before(value = "pointdemo()")注解生成通知方法进行增强
        // 故在这里调用user.add()会增强方法，运行后会出现不止一个add()方法，而是会出现多个通知方法
        user.add();
    }


    @Test
    public void testAopXml() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println("xml配置方式");
        System.out.println("****************************");

        // 基于xml配置方式，在xml配置文件中，通过<aop:aspect ref="bookProxy">提供了@Aspect生成代理对象
        // 在xml配置文件中通过<aop:before method="before" pointcut-ref="p"></aop:before>生成通知方法进行增强
        // 故在这里调用book.buy()会增强方法，运行后会出现不止一个buy()方法，而是会出现多个通知方法
        book.buy();
    }


}
