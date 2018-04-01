package org.ace.runoob;

import org.ace.runoob.impl.OperationAdd;
import org.ace.runoob.impl.OperationMultiply;

/**
 * 在策略模式（Strategy Pattern）
 * 一个类的行为或其算法可以在运行时更改。这种类型的设计模式属于行为型模式。
 *
 * 在策略模式中，我们创建表示各种策略的对象和一个行为随着策略对象改变而改变的 context 对象。
 * 策略对象改变 context 对象的执行算法。
 * Created by Liangsj on 2018/3/12.
 */
public class Demo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(5, 6));

        context.setStrategy(new OperationMultiply());
        System.out.println(context.executeStrategy(3,4));
    }
}
