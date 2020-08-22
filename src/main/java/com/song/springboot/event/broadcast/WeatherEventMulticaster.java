package com.song.springboot.event.broadcast;

/**
 * @Description TODO
 * @Date 2020/8/13 22:10
 * @Created by Jeremy
 */
public class WeatherEventMulticaster extends AbstractEventMulticaster {
    @Override
    protected void doEnd() {
        System.out.println("结束");
    }

    @Override
    protected void doStart() {
        System.out.println("开始");
    }
}
