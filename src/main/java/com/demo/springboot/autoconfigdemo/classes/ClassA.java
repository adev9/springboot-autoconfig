package com.demo.springboot.autoconfigdemo.classes;

/**
 * @author : Alex Hu
 * date : 2020/3/20 下午14:30
 * description : 无 @Component 注解，不会被springboot的 @ComponentScan 扫描并注入
 */
public class ClassA {
    public ClassA() {
        System.out.println("ClassA.ClassA  构造器被执行");
    }
}
