package org.ace.headfirst.impl;

import org.ace.headfirst.FlyBehavior;

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
