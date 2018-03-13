package org.ace.headfirst.display;

import org.ace.headfirst.pojo.Weather;

/**
 * 观察者
 */
public interface Observer {

    /**
     * 观察都注册到主题后，天气数据有更新，会通过此update()方法通知观察者
     * @param weather
     */
    void update(Weather weather);

}
