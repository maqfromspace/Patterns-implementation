import simplefactory.pizza.AbstractPizza;
import simplefactory.pizza.CheesePizza;
import simplefactory.pizza.PeperoniPizza;
import simplefactory.pizza.SimplePizza;

public class SimplePizzaFactory {
    public AbstractPizza createPizza(String type) {
        if(type.equalsIgnoreCase("cheese")) {
            return new CheesePizza();
        } else if(type.equalsIgnoreCase("peperoni")) {
            return new PeperoniPizza();
        } else
            return new SimplePizza();
    }
}
