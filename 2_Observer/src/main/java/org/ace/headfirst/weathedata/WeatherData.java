package org.ace.headfirst.weathedata;

import org.ace.headfirst.display.Observer;
import org.ace.headfirst.pojo.Weather;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题,追踪来看气象站的数据，并更新告板
 * @author L
 * @date 2018/3/13
 */
public class WeatherData implements Subject {

    private List<Observer> observers;
    private Weather weather;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(weather);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    // 天气得到更新
    public void setMeasurement(Weather weather) {
        this.weather = weather;
        measurementsChanged();
    }
}
