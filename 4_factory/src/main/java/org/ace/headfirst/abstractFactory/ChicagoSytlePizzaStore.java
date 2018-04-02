package org.ace.headfirst.abstractFactory;

import org.ace.headfirst.Pizza;
import org.ace.headfirst.abstractFactory.pojo.ChicagoCheesePizza;
import org.ace.headfirst.abstractFactory.pojo.ChicagoPepperoniPizza;
import org.ace.headfirst.abstractFactory.pojo.NYCheesePizza;
import org.ace.headfirst.abstractFactory.pojo.NYPepperoniPizza;

/**
 * 具体的工厂
 * @author L
 * @date 2018/4/2
 */
public class ChicagoSytlePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new ChicagoCheesePizza();
        } else if (type.equals("pepperoni")){
            pizza = new ChicagoPepperoniPizza();
        }
        return pizza;
    }
}
