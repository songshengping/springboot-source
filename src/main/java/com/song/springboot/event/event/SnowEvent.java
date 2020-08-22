package com.song.springboot.event.event;

/**
 * @Description 下雪事件
 * @Date 2020/8/8 20:28
 * @Created by Jeremy
 */
public class SnowEvent extends WeatherEvent{
    @Override
    public String getWeather() {
        return "下雪";
    }
}
