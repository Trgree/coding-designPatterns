package org.ace.jdk;

import org.ace.headfirst.display.DisplayElement;
import org.ace.headfirst.pojo.Weather;

import java.util.Observable;
import java.util.Observer;

/**
 * 当前天气
 * @author L
 * @date 2018/3/13
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable observable;
    private Weather weather;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + weather);
    }


    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.weather = weatherData.getWeather();// 采用拉的方式
            display();
        }
    }
}
