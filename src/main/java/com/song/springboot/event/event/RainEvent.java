package com.song.springboot.event.event;

/**
 * @Description 下雨事件
 * @Date 2020/8/8 20:29
 * @Created by Jeremy
 */
public class RainEvent extends WeatherEvent{
    @Override
    public String getWeather() {
        return "下雨";
    }
}
