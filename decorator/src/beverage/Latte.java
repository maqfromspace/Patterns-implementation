package beverage;

import price.Prices;

public class Latte extends AbstractBeverage{
    public Latte() {
        this.description = "Latte";
    }
    @Override
    public int getCost() {
        return Prices.LATTE_PRICE;
    }
}
