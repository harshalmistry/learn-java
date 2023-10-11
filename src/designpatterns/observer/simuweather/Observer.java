package designpatterns.observer.simuweather;

public interface Observer {
    void update(float temperature, float humidity, float pressure);

    // for pull data example
    // comment out above method, if below is used
    // void update();
}
