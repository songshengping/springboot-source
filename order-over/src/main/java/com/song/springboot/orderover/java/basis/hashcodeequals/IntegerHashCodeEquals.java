package com.song.springboot.orderover.java.basis.hashcodeequals;

import java.util.Arrays;

/**
 * @Description 对于Integer来讲的 == ,hashcode ,equals 的区别
 * 1.Integer基本类型重写了equals和hashCode方法,比较的是数值是否相等.
 * 2.当Integer类型在-128和127之间,== 比较为相等.因为都是从缓存地址中取值.所以地址相等
 * 3.当Integer显式的使用new Integer(int value)去创建对象时候.== 比较 为 false
 * 4.跨类型比较为false
 * @Date 2020/9/1 23:26
 * @Created by Jeremy
 */
public class IntegerHashCodeEquals {
    public static void main(String[] args) {
        Integer int1 = 1;
        String intStr = "1";
        Integer int111 = new Integer(1);
        Integer int1111 = new Integer(1);
        System.out.println("================================================================");
        System.out.println("基本对象类型==: " + (int1 == int111));
        System.out.println("基本对象类型equals:" + (int1 .equals(int111) ));
        System.out.println("基本对象类型hashCode:" + (int1 .hashCode() == int111.hashCode()));
        System.out.println("================================================================");
        System.out.println("基本对象类型==: " + (int1111 == int111));
        System.out.println("基本对象类型equals:" + (int1111 .equals(int111) ));
        System.out.println("基本对象类型hashCode:" + (int1111 .hashCode() == int111.hashCode()));
        System.out.println("================================================================");
        System.out.println("跨类型比较==: " + (intStr.equals(int1)));
        System.out.println("跨类型比较==: " + (int1.equals(intStr)));
    }
}
