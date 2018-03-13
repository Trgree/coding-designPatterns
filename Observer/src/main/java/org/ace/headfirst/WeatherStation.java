package org.ace.headfirst;

import org.ace.headfirst.display.CurrentConditionsDisplay;
import org.ace.headfirst.display.ForecastDisplay;
import org.ace.headfirst.pojo.Weather;
import org.ace.headfirst.weathedata.WeatherData;

/**
 * 观察者模式
 * @author L
 * @date 2018/3/13
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // 当天天气，初始化后，注册到WeatherData
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        // 天气预报，初始化后，注册到WeatherData
        ForecastDisplay forecastDisplay= new ForecastDisplay(weatherData);

        //天气更新，WeatherData自动通知所有的布告板
        weatherData.setMeasurement(new Weather(12, 23, 21));
    }
}
