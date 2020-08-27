package com.song.springboot.jutil;

/**
 * @Description 模拟String
 * @Date 2020/8/23 21:38
 * @Created by Jeremy
 */
public final class SString {
    private Integer value;

    private SString(){}

    public SString(Integer value){
        this.value = value;
    }

    @Override
    public int hashCode() {
        return this.value%10;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
