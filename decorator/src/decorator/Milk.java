package decorator;

import beverage.AbstractBeverage;
import price.Prices;

public class Milk extends AbstractDecorator {
    String decoratorDescription = "milk";

    public Milk(AbstractBeverage abstractBeverage) {
        super(abstractBeverage);
    }

    @Override
    public int getCost() {
        return beverage.getCost() + Prices.MILK_PRICE;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + " + decoratorDescription;
    }
}
