package beverage;

import price.Prices;

public class Espresso extends AbstractBeverage{
    public Espresso() {
        this.description = "Espresso";
    }
    @Override
    public int getCost() {
        return Prices.ESPRESSO_PRICE;
    }
}
