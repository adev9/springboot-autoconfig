package com.demo.springboot.autoconfigdemo;

import com.demo.springboot.autoconfigdemo.autoconfig.DemoEnableAutoConfig;
import org.springframework.boot.SpringApplication;

/**
 * @author Alex Hu
 */
@DemoEnableAutoConfig
//@ComponentScan
public class AutoconfigDemoApplication {

    public static void main(String[] args) {
        //方法1：spring的启动方式
        //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoconfigDemoApplication.class);

        //方法2：springboot的启动方式
        SpringApplication.run(AutoconfigDemoApplication.class, args);
    }

}
