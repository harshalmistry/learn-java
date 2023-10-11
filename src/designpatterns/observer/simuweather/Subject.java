package designpatterns.observer.simuweather;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifiyObservers();
}
