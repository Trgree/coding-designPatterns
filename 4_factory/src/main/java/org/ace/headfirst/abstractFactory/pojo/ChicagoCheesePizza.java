package org.ace.headfirst.abstractFactory.pojo;

import org.ace.headfirst.Pizza;

/**
 * @author L
 * @date 2018/4/2
 */
public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        name="Chicago Style sauce and Cheese Pizza";
        dough = "Extra Thick Crust Dough";
    }

    @Override
    public void box() {
        System.out.println("Chicago box");
    }
}
