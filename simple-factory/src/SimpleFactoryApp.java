import simplefactory.pizza.AbstractPizza;

import java.util.Scanner;

public class SimpleFactoryApp {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        AbstractPizza pizza;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter type of pizza: ");
        String typeOfPizza = sc.next();
        pizza = simplePizzaFactory.createPizza(typeOfPizza);
        pizza.eat();

    }
}
