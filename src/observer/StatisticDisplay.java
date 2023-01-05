package observer;

import java.util.ArrayList;
import java.util.List;

public class StatisticDisplay implements DisplayElement, Observer{
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("high temperature = "+ maxTemp + ", low temperature = "
                + minTemp + ", average temperature = " + tempSum / numReadings);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        numReadings++;
        tempSum += temperature;

        if (temperature > maxTemp) {
            maxTemp = temperature;
        }

        if (temperature < minTemp) {
            minTemp = temperature;
        }

        display();
    }
}
