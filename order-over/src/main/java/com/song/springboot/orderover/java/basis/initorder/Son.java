package com.song.springboot.orderover.java.basis.initorder;

/**
 * @Description 子类
 * @Date 2020/9/1 23:14
 * @Created by Jeremy
 */
public class Son extends Father{
    public static String sStr = "Son";
    public Son(){
        System.out.println("son construction method");
    }

    @Override
    public void fatherMethod() {
//        super.fatherMethod();
        System.out.println("子类重写父类方法");
    }
}
