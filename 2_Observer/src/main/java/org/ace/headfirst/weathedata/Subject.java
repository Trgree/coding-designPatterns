package org.ace.headfirst.weathedata;

import org.ace.headfirst.display.Observer;

/**
 * 主题接口
 *
 * @author L
 * @date 2018/3/13
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();

}
