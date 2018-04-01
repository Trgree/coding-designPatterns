package org.ace.headfirst;

import org.ace.headfirst.behavior.FlyBehavior;
import org.ace.headfirst.behavior.QuackBehavior;

/**
 * 策略模式
 * 定义了算法族，分别封装起来，让他们之间可以互相替换，
 * 此模式让算法的变化独立于使用算法的客户
 * @author L
 * @date 2018/3/12
 */
public abstract  class Duck {

    // 鸭子的行为被放在分开的类中，此类专门提供某行为接口的实现
    // 这样，鸭子类就不现再需要知道行为的实现细节
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All ducks float, even decoys");
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();
}

