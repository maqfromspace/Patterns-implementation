package simplefactory.pizza;

import simplefactory.pizza.AbstractPizza;

public class SimplePizza extends AbstractPizza {
    @Override
    public void eat() {
        System.out.println("Simple pizza =(");
    }
}
