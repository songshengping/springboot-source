package com.song.springboot.event.listener;

import com.song.springboot.event.event.SnowEvent;
import com.song.springboot.event.event.WeatherEvent;

/**
 * @Description 下雪事件监听器
 * @Date 2020/8/9 0:25
 * @Created by Jeremy
 */
public class SnowListener implements WeatherListener{

    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof SnowEvent) {
            System.out.println("event = " + event.getWeather());
        }
    }
}
