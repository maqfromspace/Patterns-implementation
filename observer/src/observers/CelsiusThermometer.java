package observers;

import subject.Subject;
import subject.WeatherStation;

public class CelsiusThermometer implements Observer{
    int temperature;
    Subject subject;

    public CelsiusThermometer(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void updateTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Celsius thermometer show " + this.temperature + "℃");
    }
}
