package com.song.springboot.event;

import com.song.springboot.event.broadcast.WeatherEventMulticaster;
import com.song.springboot.event.event.RainEvent;
import com.song.springboot.event.event.SnowEvent;
import com.song.springboot.event.listener.RainListener;
import com.song.springboot.event.listener.SnowListener;
import com.song.springboot.event.listener.WeatherListener;

/**
 * @Description 测试监听器模式
 * @Date 2020/8/13 22:11
 * @Created by Jeremy
 */
public class EventTest {
    public static void main(String[] args) {
        WeatherEventMulticaster multicaster = new WeatherEventMulticaster();
        RainListener rainListener = new RainListener();
        SnowListener snowListener = new SnowListener();
        multicaster.addListener(rainListener);
        multicaster.addListener(snowListener);
        multicaster.multicastEvent(new SnowEvent());
        multicaster.multicastEvent(new RainEvent());
        multicaster.removeListener(snowListener);
        multicaster.multicastEvent(new SnowEvent());
        multicaster.multicastEvent(new RainEvent());
    }
}
