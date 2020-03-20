package com.demo.springboot.autoconfigdemo.autoconfig;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : Alex Hu
 * date : 2020/3/20 下午13:27
 * description : 自定义个注解，模拟springboot的@EnableAutoConfiguration
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(value = {AutoConfigurationImportSelector.class})
public @interface DemoEnableAutoConfig {
}
