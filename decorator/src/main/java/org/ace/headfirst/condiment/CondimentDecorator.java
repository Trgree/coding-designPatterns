package org.ace.headfirst.condiment;

import org.ace.headfirst.Beverage;

/**
 * 调料，即装饰者
 * @author L
 * @date 2018/4/2
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();// 所有装饰者都必须实现getDescription
}
