package com.demo.springboot.autoconfigdemo.classes;

import org.springframework.stereotype.Component;

/**
 * @author : Alex Hu
 * date : 2020/3/20 下午14:30
 * description : 加了 @Component 可以被springboot的 @ComponentScan 扫描并注入
 */
@Component
public class ClassC {

    public ClassC() {
        System.out.println("ClassC.ClassC  构造器被执行");
    }
}
