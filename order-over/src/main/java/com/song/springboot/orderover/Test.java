package com.song.springboot.orderover;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author Jeremy
 * @Description //TODO
 * @Date 2020-08-28 16:46
 **/
public class Test {
    public static void main(String[] args) {
        int n = 88;

        ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();
        map.put("sing","song");

        if (n > 80) {
            System.out.println("args = [" + 80 + "]");
        } else if (n > 60) {
            System.out.println("args = [" + 60 + "]");
        } else {
            System.out.println("args = [ else ]");
        }

    }

}
