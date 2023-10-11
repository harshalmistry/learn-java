package designpatterns.observer.simuweather;

public class AverageTemperatureDisplay implements Observer, DisplayWeatherData{

    private float temperature;
    private WeatherData weatherData;

    public AverageTemperatureDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Avg/Max/Min Temperature: " + this.temperature +
                "/" + (this.temperature+1) + "/" + (this.temperature-1) + "F degrees");
    }

    // Here, data is pushed by weatherdata object.
    // Even humidity and pressure is not required
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        display();
    }

    // Pull example

    /**
    @Override
    public void update(){
        // now pulling only required data from weather data object
        this.temperature = weatherData.getTemperature();
        display();
    }
    **/


    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
}
