import observers.CelsiusThermometer;
import observers.FahrenheitThermometer;
import observers.Observer;
import subject.WeatherStation;

public class ObserverApp {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer celsiusThermometer = new CelsiusThermometer(weatherStation);
        Observer fahrenheitThermometer = new FahrenheitThermometer(weatherStation);
        System.out.println("----");

        //Update temperature
        weatherStation.updateTemperature(10);
        System.out.println("----");

        //Unsubscribe
        weatherStation.deleteObserver(celsiusThermometer);
        weatherStation.deleteObserver(fahrenheitThermometer);

        //Update temperature
        weatherStation.updateTemperature(20);
        System.out.println("----");

        //Subscribe
        weatherStation.registerObserver(celsiusThermometer);
        weatherStation.registerObserver(fahrenheitThermometer);

        //Update temperature
        weatherStation.updateTemperature(30);
        System.out.println("----");
    }
}
