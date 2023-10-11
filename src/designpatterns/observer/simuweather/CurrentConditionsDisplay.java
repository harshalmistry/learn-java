package designpatterns.observer.simuweather;

public class CurrentConditionsDisplay implements Observer, DisplayWeatherData{

    private float temperature;
    private float humidity;
    private float pressure;

    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current weather conditions: " + this.temperature +
                "F degrees and " + this.humidity + " % humidity");
    }
}
