package com.song.springboot;

import com.song.springboot.initializer.SecondIntializer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = "com.song.springboot.mapper")
public class SpringbootMainApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringbootMainApplication.class, args);
//        SpringApplication springApplication = new SpringApplication(SpringbootApplication.class);
//        springApplication.addInitializers(new SecondIntializer());
//        springApplication.run(args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(SpringbootMainApplication.class);

        context.refresh();

        context.close();
    }


}
