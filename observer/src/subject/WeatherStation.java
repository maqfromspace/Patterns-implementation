package subject;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    int temperature;
    List<Observer> observers;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        System.out.println("Register observer " + observer.getClass().getSimpleName());
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.updateTemperature(temperature));
    }

    @Override
    public void deleteObserver(Observer observer) {
        if(observers.remove(observer))
            System.out.println("Observer " + observer.getClass().getSimpleName() + " removed successfully!");
        else
            System.out.println("Observer not found!");

    }

    public void updateTemperature(int temperature) {
        System.out.println("Weather station update temperature: " + this.temperature + " -> " + temperature);
        this.temperature = temperature;
        notifyObservers();
    }
}
