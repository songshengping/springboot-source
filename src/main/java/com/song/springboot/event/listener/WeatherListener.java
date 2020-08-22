package com.song.springboot.event.listener;

import com.song.springboot.event.event.WeatherEvent;

/**
 * @Description 天气监听事件监听器,监听天气事件
 * @Date 2020/8/9 0:20
 * @Created by Jeremy
 */
public interface WeatherListener {
    void onWeatherEvent(WeatherEvent event);
}
