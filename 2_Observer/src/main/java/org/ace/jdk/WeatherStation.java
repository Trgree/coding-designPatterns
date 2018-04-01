package org.ace.jdk;


import org.ace.headfirst.pojo.Weather;


/**
 * JDK内置的观察者模式
 * @author L
 * @date 2018/3/13
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // 当天天气，初始化后，注册到WeatherData
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        //天气更新，WeatherData自动通知所有的布告板
        weatherData.setMeasurements(new Weather(12, 23, 21));
    }
}
