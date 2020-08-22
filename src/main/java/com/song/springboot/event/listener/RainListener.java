package com.song.springboot.event.listener;

import com.song.springboot.event.event.RainEvent;
import com.song.springboot.event.event.WeatherEvent;

/**
 * @Description 下雨事件监听器
 * @Date 2020/8/9 0:21
 * @Created by Jeremy
 */
public class RainListener implements WeatherListener{
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof RainEvent) {
            System.out.println("event = " + event.getWeather());
        }
    }
}
