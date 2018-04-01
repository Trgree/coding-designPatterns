package org.ace.headfirst.coffee;

import org.ace.headfirst.Beverage;

/**
 * 综合咖啡
 * @author L
 * @date 2018/4/2
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
