package com.song.springboot.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Date 2020/7/19 15:08
 * @Created by Jeremy
 */
@Order(3)
public class ThirdIntializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        Map map = new HashMap();
        map.put("key3", "value3");
        MapPropertySource mapPropertySource = new MapPropertySource("ThirdIntializer", map);
        environment.getPropertySources().addLast(mapPropertySource);
        System.out.println("run SecondInitializer");
    }
}
