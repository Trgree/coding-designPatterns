package org.ace.headfirst.condiment;

import org.ace.headfirst.Beverage;

/**
 * 大豆
 * @author L
 * @date 2018/4/2
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.25  + beverage.cost();
    }
}
