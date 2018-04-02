package org.ace.headfirst;

/**
 * @author L
 * @date 2018/4/2
 */
public abstract class Pizza {
    protected  String name;
    protected String dough;
    protected String sauce;

    public void prepare(){
        System.out.println("Prepareing " + name);
        System.out.println("Tossing dougn。。。 " + name);
    }
    public void bake(){
        System.out.println("bake for 25 minutes as 350");
    }
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
