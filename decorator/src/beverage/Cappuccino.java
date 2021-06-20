package beverage;

import price.Prices;

public class Cappuccino extends AbstractBeverage{
    public Cappuccino() {
        this.description = "Cappuccino";
    }
    @Override
    public int getCost() {
        return Prices.CAPPUCCINO_PRICE;
    }
}
