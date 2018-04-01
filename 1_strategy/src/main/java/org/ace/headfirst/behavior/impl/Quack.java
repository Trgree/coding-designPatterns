package org.ace.headfirst.behavior.impl;

import org.ace.headfirst.behavior.QuackBehavior;

/**
 * @author L
 * @date 2018/3/12
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack ...");
    }
}
