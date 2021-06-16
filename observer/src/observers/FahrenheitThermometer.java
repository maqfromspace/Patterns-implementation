package observers;

import subject.Subject;

public class FahrenheitThermometer implements Observer{
    double temperature;
    Subject subject;

    public FahrenheitThermometer(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void updateTemperature(int temperature) {
        this.temperature = (temperature * 1.8) + 32;
        System.out.println("Fahrenheit thermometer show " + this.temperature + "°F");
    }
}
