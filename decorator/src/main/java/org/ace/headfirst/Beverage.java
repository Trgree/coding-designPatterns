package org.ace.headfirst;

/**
 * 饮料
 * @author L
 * @date 2018/4/2
 */
public abstract  class Beverage {
    protected  String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
