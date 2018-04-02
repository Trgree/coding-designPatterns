package org.ace.headfirst.abstractFactory;

import org.ace.headfirst.Pizza;
import org.ace.headfirst.abstractFactory.pojo.NYCheesePizza;
import org.ace.headfirst.abstractFactory.pojo.NYPepperoniPizza;
import org.ace.headfirst.simpleFactory.pojo.CheesePizza;
import org.ace.headfirst.simpleFactory.pojo.PepperoniPizza;
import org.ace.headfirst.simpleFactory.pojo.VegglePizza;

/**
 * 具体的工厂
 * @author L
 * @date 2018/4/2
 */
public class NYStylePizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new NYCheesePizza();
        } else if (type.equals("pepperoni")){
            pizza = new NYPepperoniPizza();
        }
        return pizza;
    }
}
