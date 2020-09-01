package com.song.springboot.orderover.java.basis.initorder;

/**
 * @Description JAVA初始化顺序
 * 结论:
 * 1.子类初始化实例对象,会首先初始化父类
 * 2.子类重写父类方法,当子类调用该方法时,不会调用父类方法
 * @Date 2020/9/1 23:12
 * @Created by Jeremy
 */
public class InitOrderDemo {
    public static void main(String[] args) {
        Son son = new Son();
        son.fatherMethod();
        //Son son1 = new Son();
    }
}
