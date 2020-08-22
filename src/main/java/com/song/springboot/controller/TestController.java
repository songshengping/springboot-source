package com.song.springboot.controller;

import com.song.springboot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Date 2020/7/19 18:00
 * @Created by Jeremy
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test1")
    public String test1(){
        return testService.test1();
    }

    @RequestMapping(value = "/test2")
    public String test2(){
        return testService.test2();
    }

    @RequestMapping(value = "/test3")
    public String test3(){
        return testService.test3();
    }
}
