package org.ace.headfirst.abstractFactory;

import org.ace.headfirst.Pizza;

/**
 * @author L
 * @date 2018/4/2
 */
public abstract  class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();

        return pizza;
    }

    /**
     * 实例化披萨的责任被移到一个“方法”中，些方法就如同一个“工厂”
     * @param type
     * @return
     */
    abstract Pizza createPizza(String type);
}
