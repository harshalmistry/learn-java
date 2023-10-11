package designpatterns.observer.simuweather;

public class SimUWeatherMain {

    public static void main(String[] args) {
        System.out.println("**** BlaBla Weather ****");

        // initializing weather station
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurementData(0, 0, 0);

        // currently there are three types of displays that shows weather data.
        // current, average and forecast of weather.
        // It also observers, weather station if there is change in weather and displays it.
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        AverageTemperatureDisplay averageTemperatureDisplay = new AverageTemperatureDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // change in weather, see how displays update it accordingly
        System.out.println("\n**** Change in Weather ****");
        weatherData.setMeasurementData(80, 50, 29.0f);
        System.out.println("\n**** Change in Weather ****");
        weatherData.setMeasurementData(70, 51, 29.6f);
        System.out.println("\n**** Change in Weather ****");
        weatherData.setMeasurementData(90, 52, 27.0f);

    }
}
