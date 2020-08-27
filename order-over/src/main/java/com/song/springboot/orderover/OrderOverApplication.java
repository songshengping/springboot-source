package com.song.springboot.orderover;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.song.springboot.orderover.mapper")
public class OrderOverApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderOverApplication.class, args);
    }

}
