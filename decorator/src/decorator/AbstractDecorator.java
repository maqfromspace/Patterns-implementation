package decorator;

import beverage.AbstractBeverage;

public abstract class AbstractDecorator extends AbstractBeverage {
    AbstractBeverage beverage;

    public AbstractDecorator(AbstractBeverage abstractBeverage) {
        this.beverage = abstractBeverage;
    }

    public abstract String getDescription();
}
