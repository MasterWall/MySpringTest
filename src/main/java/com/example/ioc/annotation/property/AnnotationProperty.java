package com.example.ioc.annotation.property;

import com.example.ioc.annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author cyx
 * @date 2020/12/14
 */

@Service(value = "annotationProperty")
public class AnnotationProperty {

    // 属性值注入
    @Value("cyx")
    private String name;

     // 根据类型进行注入，注意实现接口的类UserDaoImp也要加上注解，如@Service
    @Autowired
    // 根据名称进行注解
    @Qualifier(value = "abc")
    private UserDao userDao;

    public void add() {
        System.out.println("service add......."+name);
        userDao.add();
        System.out.println("使用属性注解@Autowired时，注意实现接口的类UserDaoImp也要加上注解，如@Service");
        System.out.println("使用属性注解@Qualifier(value = \"abc\")，注意实现接口的类UserDaoImp的注解里也要加上(value = \"abc\")");
        System.out.println("至于为什么在实现类的接口上加注解而不是在接口上加注解，感觉是多态性");
    }

}
