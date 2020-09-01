package com.song.springboot.orderover.java.basis.initorder;

/**
 * @Description 父类
 * @Date 2020/9/1 23:13
 * @Created by Jeremy
 */
public class Father {
    public static String fStr = "father";
    public String str = "common";
    public Father(){
        System.out.println("father construction method");
    }

    public static void staticMethod(){
        System.out.println("father static method");
    }

    public void fatherMethod(){
        System.out.println("父类方法");
    }
}
