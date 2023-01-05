package observer;

public class ForecastDisplay implements DisplayElement, Observer{
    private float currentHumidity = 29.0f;
    private  float lastHumidity;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        if (lastHumidity > currentHumidity)
            System.out.println("날씨가 안좋다");
        else if (lastHumidity < currentHumidity)
            System.out.println("날씨가 좋다");
        else
            System.out.println("비슷하다.");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastHumidity = currentHumidity;
        currentHumidity = humidity;
        display();
    }
}
