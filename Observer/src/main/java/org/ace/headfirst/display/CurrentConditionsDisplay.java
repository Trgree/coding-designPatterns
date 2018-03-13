package org.ace.headfirst.display;

import org.ace.headfirst.pojo.Weather;
import org.ace.headfirst.weathedata.Subject;

/**
 * 当前天气
 * @author L
 * @date 2018/3/13
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Subject subject;
    private Weather weather;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.subject = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + weather);
    }

    @Override
    public void update(Weather weather) {
        this.weather = weather;
        display();
    }
}
