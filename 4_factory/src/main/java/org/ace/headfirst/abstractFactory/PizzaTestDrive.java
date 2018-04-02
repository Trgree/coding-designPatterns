package org.ace.headfirst.abstractFactory;

import org.ace.headfirst.Pizza;

/**
 * 抽象工厂
 * @author L
 * @date 2018/4/2
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();// 多个工厂
        PizzaStore chPizzaStore = new ChicagoSytlePizzaStore();// 多个工厂

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        pizza = chPizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
