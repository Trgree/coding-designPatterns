package org.ace.runoob.impl;

import org.ace.runoob.Strategy;

/**
 * Created by Liangsj on 2018/3/12.
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
