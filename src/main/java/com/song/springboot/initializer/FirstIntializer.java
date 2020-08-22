package com.song.springboot.initializer;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description SpringBoot初始化器
 * @See {@link ApplicationContextInitializer}
 * @Date 2020/7/19 15:08
 * @Created by Jeremy
 */
@Order(1)
public class FirstIntializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        Map map = new HashMap();
        map.put("key1", "value1");
        MapPropertySource mapPropertySource = new MapPropertySource("fitstInitializer", map);
        environment.getPropertySources().addLast(mapPropertySource);
        System.out.println("run firstInitializer");
    }
}
