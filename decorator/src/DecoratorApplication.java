import beverage.AbstractBeverage;
import beverage.Cappuccino;
import beverage.Espresso;
import beverage.Latte;
import decorator.Chocolate;
import decorator.Milk;
import decorator.Syrup;
import price.Prices;

import java.util.Scanner;

public class DecoratorApplication {
    public static void main(String[] args) {
        AbstractBeverage beverage = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter type of beverage: ");
        System.out.println("Choose type: ");
        System.out.println("1) Cappuccino (" + Prices.CAPPUCCINO_PRICE + "₽)");
        System.out.println("2) Espresso (" + Prices.ESPRESSO_PRICE + "₽)");
        System.out.println("3) Latte (" + Prices.LATTE_PRICE + "₽)");

        boolean correctBeverage = false;
        while (!correctBeverage)
            switch (sc.nextInt()) {
                case 1:
                    beverage = new Cappuccino();
                    correctBeverage = true;
                    break;
                case 2:
                    beverage = new Espresso();
                    correctBeverage = true;
                    break;
                case 3:
                    beverage = new Latte();
                    correctBeverage = true;
                    break;
                default:
                    System.out.println("Enter correct type! ");
            }

        System.out.println("Would you like some additional options? ");
        System.out.println("1) Yes");
        System.out.println("Other) No");

        if(sc.nextInt() == 1) {
            boolean orderHasBeenMade = false;

            while (!orderHasBeenMade) {
                System.out.println("Choose option: ");
                System.out.println("1) Chocolate (" + Prices.CHOCOLATE_PRICE + "₽)");
                System.out.println("2) Milk (" + Prices.MILK_PRICE + "₽)");
                System.out.println("3) Syrup (" + Prices.SYRUP_PRICE + "₽)");
                System.out.println("4) End order");


                boolean correctOption = false;
                while (!correctOption)
                    switch (sc.nextInt()) {
                        case 1:
                            beverage = new Chocolate(beverage);
                            correctOption = true;
                            break;
                        case 2:
                            beverage = new Milk(beverage);
                            correctOption = true;
                            break;
                        case 3:
                            beverage = new Syrup(beverage);
                            correctOption = true;
                            break;
                        case 4:
                            orderHasBeenMade = true;
                            correctOption = true;
                            break;
                        default:
                            System.out.println("Enter correct option! ");
                    }
            }
        }

        System.out.println("Your order: " + beverage.getDescription());
        System.out.println("Price: " + beverage.getCost() +  "₽");

    }
}
