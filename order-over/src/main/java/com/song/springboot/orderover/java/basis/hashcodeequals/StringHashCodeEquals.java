package com.song.springboot.orderover.java.basis.hashcodeequals;

/**
 * @Description 对于String来讲的 == ,hashcode ,equals 的区别
 *
 * 总结
 * 1. == 比较的是内存地址.对于String来说,直接定义String 会被缓存
 * 2. String重写了equals和hashCode方法,比较的是每个字符是否相同
 @Date 2020/9/1 23:26
 * @Created by Jeremy
 */
public class StringHashCodeEquals {
    public static void main(String[] args) {
        String str11 = new String("str");
        String str1 = "str";
        String str111 = new String("str");
        System.out.println("================================================================");
        System.out.println("基本对象String类型==: " + (str1 == str11));
        System.out.println("基本对象String类型equals:" + (str1 .equals(str11) ));
        System.out.println("基本对象String类型hashCode:" + (str1 .hashCode() == str11.hashCode()));
        System.out.println("================================================================");
        System.out.println("基本对象String类型==: " + (str11 == str111));
        System.out.println("基本对象String类型equals:" + (str11 .equals(str111) ));
        System.out.println("基本对象String类型hashCode:" + (str11 .hashCode() == str111.hashCode()));
    }
}
