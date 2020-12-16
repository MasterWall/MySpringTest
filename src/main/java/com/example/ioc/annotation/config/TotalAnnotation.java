package com.example.ioc.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author cyx
 * @date 2020/12/14
 */

@Configuration
@ComponentScan(basePackages = {"com.example.ioc.annotation"})
public class TotalAnnotation {
}
