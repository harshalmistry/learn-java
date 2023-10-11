package designpatterns.observer.simuweather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private float temperature;
    private float humidity;
    private float pressure;

    // These are list of observers, interested to get an update about WeatherData
    private List<Observer> observerList;

    public WeatherData(){
        observerList = new ArrayList<>();
    }

    // Observer register to get update about WeatherData
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    // Observer removes themselves to stop getting WeatherData update
    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    /** Update all observers with current WeatherData
     Problem: This art of updating data is called pushing current state.
     Subject, here weatherdata pushes all information (temp, humidity and pressure) to all observers
     irrelevant if observer needs all of them. For example AverageTemperatureDisplay needs only temperature updates.
     Alternate is to allow observers to pull the current state as per need.
     Pull is better than push, if later WeatherData adds one more state e.g. winds-peed
     then observer update method needs change and so all implementations(observers),
     some of them might not even need winds-speed in display
     **/
    @Override
    public void notifiyObservers() {
        float currentTemp = getTemperature();
        float currentHumidity = getHumidity();
        float currentPressure = getPressure();
        this.observerList.forEach(observer -> observer.update(currentTemp, currentHumidity, currentPressure));
    }

    // pull example for notifiyobservers
    // Here need to change Observer interface - update method signature
    // now observers do not receive subject's state as part of parameters
    // instead when update is invoked, observers get/fetch required state using public getters within subject.
    // check AverageTemperatureDisplay for pull example change
    /**
        public void notifyObservers(){
            this.observerList.forEach(observer -> observer.update());
        }
    **/


    // It updates current WeatherData from weather station and initiate notification to observers
    public void setMeasurementData(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifiyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
