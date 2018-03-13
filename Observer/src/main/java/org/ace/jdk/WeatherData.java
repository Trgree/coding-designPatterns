package org.ace.jdk;

import org.ace.headfirst.pojo.Weather;

import java.util.Observable;

/**
 * @author L
 * @date 2018/3/13
 */
public class WeatherData extends Observable {
    private Weather weather;

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(Weather weather) {
        this.weather = weather;
        measurementsChanged();
    }

    public Weather getWeather() {
        return weather;
    }
}
