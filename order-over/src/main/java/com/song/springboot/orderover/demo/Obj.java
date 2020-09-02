package com.song.springboot.orderover.demo;

/**
 * @Author Jeremy
 * @Description 程序员宝典实例
 * @Date 2020-08-31 11:32
 **/
public class Obj {
    private String str = "default value";
    public void serStr(String str){
        this.str = str;
    }
    public String toString(){
        return str;
    }
}
