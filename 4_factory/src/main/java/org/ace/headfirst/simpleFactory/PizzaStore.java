package org.ace.headfirst.simpleFactory;

import org.ace.headfirst.Pizza;

/**
 * @author L
 * @date 2018/4/2
 */
public  class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza =  factory.createPizza(type);// 使用工厂创建披萨
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }
}
