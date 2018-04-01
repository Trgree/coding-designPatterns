package org.ace.headfirst;

import org.ace.headfirst.coffee.Espresso;
import org.ace.headfirst.condiment.Mocha;
import org.ace.headfirst.condiment.Soy;

/**
 * 装饰者模式
 * @author L
 * @date 2018/4/2
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();// 咖啡
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage = new Mocha(beverage);// 使用各种调料装饰
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
