package decorator;

import beverage.AbstractBeverage;
import price.Prices;

public class Chocolate extends AbstractDecorator{
    String decoratorDescription = "chocolate";

    public Chocolate(AbstractBeverage abstractBeverage) {
        super(abstractBeverage);
    }

    @Override
    public int getCost() {
        return beverage.getCost() + Prices.CHOCOLATE_PRICE;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + " + decoratorDescription;
    }
}
