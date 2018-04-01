package org.ace.headfirst.condiment;

import org.ace.headfirst.Beverage;

/**
 * 摩卡
 * @author L
 * @date 2018/4/2
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20  + beverage.cost();
    }
}
