package beverage;

public abstract class AbstractBeverage {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract int getCost();
}
