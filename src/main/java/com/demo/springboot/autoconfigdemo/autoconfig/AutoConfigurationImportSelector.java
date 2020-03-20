package com.demo.springboot.autoconfigdemo.autoconfig;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author : Alex Hu
 * date : 2020/3/20 上午08:55
 * description : springboot 自动装配方式，从properties文件批量导入
 */
public class AutoConfigurationImportSelector implements ImportSelector {
    //返回注解的class, META-INF/spring.factories 中的键名
    private Class<?> getSpringFactoriesLoaderFactoryClass() {
        return DemoEnableAutoConfig.class;
    }

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        List<String> configurations = getCandidateConfigurations();
        System.out.println("configurations: " + configurations);
        return StringUtils.toStringArray(configurations);
    }


    protected List<String> getCandidateConfigurations() {
        List<String> configurations = SpringFactoriesLoader.loadFactoryNames(
                //返回注解类的class
                getSpringFactoriesLoaderFactoryClass(),
                //当前类的classloader
                this.getClass().getClassLoader()
        );
        Assert.notEmpty(configurations, "No auto configuration classes found in META-INF/spring.factories. " +
                "If you are using a custom packaging, make sure that file is correct.");
        return configurations;
    }

}
