package com.song.springboot.event.broadcast;

import com.song.springboot.event.event.WeatherEvent;
import com.song.springboot.event.listener.WeatherListener;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @Date 2020/8/13 22:03
 * @Created by Jeremy
 */
public abstract class AbstractEventMulticaster implements EventMulticaster{
    private List<WeatherListener> weatherListenerList = new ArrayList<>();

    @Override
    public void multicastEvent(WeatherEvent weatherEvent) {
        doStart();
        weatherListenerList.forEach(i-> i.onWeatherEvent(weatherEvent));
        doEnd();

    }

    protected abstract void doEnd();

    protected abstract void doStart();

    @Override
    public void addListener(WeatherListener weatherListener) {
        weatherListenerList.add(weatherListener);
    }

    @Override
    public void removeListener(WeatherListener weatherListener) {
        weatherListenerList.remove(weatherListener);
    }
}
