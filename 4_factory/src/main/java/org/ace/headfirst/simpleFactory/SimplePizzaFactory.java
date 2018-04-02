package org.ace.headfirst.simpleFactory;

import org.ace.headfirst.Pizza;
import org.ace.headfirst.simpleFactory.pojo.CheesePizza;
import org.ace.headfirst.simpleFactory.pojo.PepperoniPizza;
import org.ace.headfirst.simpleFactory.pojo.VegglePizza;

/**
 * 简单工厂
 * @author L
 * @date 2018/4/2
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else if(type.equals("clam")){
            pizza = new VegglePizza();
        }
        return pizza;
    }
}
