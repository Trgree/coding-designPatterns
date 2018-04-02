package org.ace.headfirst;

import org.ace.headfirst.coffee.Espresso;
import org.ace.headfirst.condiment.Mocha;
import org.ace.headfirst.condiment.Soy;

/**
 * 装饰者模式
 * 意图：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更为灵活。

  主要解决：一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。

  何时使用：在不想增加很多子类的情况下扩展类。
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
