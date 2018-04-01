package org.ace.headfirst;

import org.ace.headfirst.behavior.impl.FlyWithWings;
import org.ace.headfirst.behavior.impl.Quack;

/**
 * @author L
 * @date 2018/3/12
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
