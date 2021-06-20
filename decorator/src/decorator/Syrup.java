package decorator;

import beverage.AbstractBeverage;
import price.Prices;

public class Syrup extends AbstractDecorator{
    String decoratorDescription = "syrup";

    public Syrup(AbstractBeverage abstractBeverage) {
        super(abstractBeverage);
    }

    @Override
    public int getCost() {
        return beverage.getCost() + Prices.SYRUP_PRICE;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + " + decoratorDescription;
    }
}
