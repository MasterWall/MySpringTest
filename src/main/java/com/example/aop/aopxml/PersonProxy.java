package com.example.aop.aopxml;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author cyx
 * @date 2020/12/16
 */

@Component
@Aspect
@Order(1)  // 在增强类上面添加注解 @Order(数字类型值)，数字类型值越小优先级越高
public class PersonProxy {
}
