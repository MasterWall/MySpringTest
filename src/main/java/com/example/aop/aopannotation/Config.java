package com.example.aop.aopannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author cyx
 * @date 2020/12/17
 */

@Configuration
@ComponentScan(basePackages = { "com.example.aop" })
@EnableAspectJAutoProxy(proxyTargetClass = true)  // 加上这条语句，就能开启Aspect生成代理对象增强方法了
public class Config {
}
