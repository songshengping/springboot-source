package com.song.springboot.event.broadcast;

import com.song.springboot.event.event.WeatherEvent;
import com.song.springboot.event.listener.WeatherListener;

public interface EventMulticaster {

    void multicastEvent(WeatherEvent weatherEvent);
    void addListener(WeatherListener weatherListener);
    void removeListener(WeatherListener weatherListener);
}
