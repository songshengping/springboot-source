package com.song.springboot.jutil;

import java.util.Arrays;

/**
 * @Description TODO
 * @Date 2020/8/23 21:40
 * @Created by Jeremy
 */
public class TestMain {
    public static void main(String[] args) {
        SString s1 = new SString(1);
        SString s2 = new SString(2);
        SString s11 = new SString(11);
        SString s21 = new SString(21);
        SHashMap<SString, Object> hashMap = new SHashMap<SString, Object>();
        hashMap.put(s1, "我是S1");
        hashMap.put(s2, "我是S2");
        hashMap.put(s11, "我是S11");
        hashMap.put(s1, "我是新的S1");
        hashMap.put(s21, "我是S21");

        System.out.println("S1 = " + hashMap.get(s1));
        System.out.println("S2 = " + hashMap.get(s2));
        System.out.println("S11 = " + hashMap.get(s11));
        System.out.println("S21 = " + hashMap.get(s21));
    }
}
