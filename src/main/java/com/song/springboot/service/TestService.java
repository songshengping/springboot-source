package com.song.springboot.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Date 2020/7/19 17:58
 * @Created by Jeremy
 */
@Service
public class TestService implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public String test1(){
        return applicationContext.getEnvironment().getProperty("key1");
    }

    public String test2() {
        return applicationContext.getEnvironment().getProperty("key2");
    }

    public String test3() {
        return applicationContext.getEnvironment().getProperty("key3");
    }
}
