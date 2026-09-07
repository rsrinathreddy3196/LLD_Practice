package DesignPatterns.ObserverDesignPattern.Observable;

import DesignPatterns.ObserverDesignPattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservable implements Observable {

    List<Observer> observersList = new ArrayList<>();
     double currentTemperature=0;

    @Override
    public void add(Observer obj) {
        observersList.add(obj);
    }

    @Override
    public void remove(Observer obj) {
        observersList.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observersList){
            observer.update();
        }
    }

    @Override
    public void setData(double temperature) {
        currentTemperature=temperature;
        notifyObservers();
    }

    @Override
    public double getData() {
        return currentTemperature;
    }
}
