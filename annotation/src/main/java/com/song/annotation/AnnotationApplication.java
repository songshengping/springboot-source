package com.song.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * {@link Component} 扫描实例
 * @see ComponentScan
 */
//@SpringBootApplication
@ComponentScan(basePackages = "com.song.annotation")
public class AnnotationApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 注册Configuration class
        context.register(AnnotationApplication.class);

        // 启动应用上下文
        context.refresh();

        // 依赖查找 TestClass Bean
        TestClass testClass = context.getBean(TestClass.class);

        System.out.println("testClass = " + testClass);

        context.close();
    }

}
