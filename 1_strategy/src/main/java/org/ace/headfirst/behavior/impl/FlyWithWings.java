package org.ace.headfirst.behavior.impl;

import org.ace.headfirst.behavior.FlyBehavior;

/**
 * @author L
 * @date 2018/3/12
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly ...");
    }
}
