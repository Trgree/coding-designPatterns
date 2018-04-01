package org.ace.headfirst.display;

import org.ace.headfirst.pojo.Weather;
import org.ace.headfirst.weathedata.Subject;

/**
 * 天气预报
 * @author L
 * @date 2018/3/13
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private Subject subject;
    private Weather weather;

    public ForecastDisplay(Subject weatherData) {
        this.subject = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast conditions:" + weather);
    }

    @Override
    public void update(Weather weather) {
        this.weather = weather;
        display();
    }
}
