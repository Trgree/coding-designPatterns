package org.ace.headfirst.coffee;

import org.ace.headfirst.Beverage;

/**
 * 浓咖啡
 * @author L
 * @date 2018/4/2
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
