package DesignPatterns.ObserverDesignPattern.Observable;

import DesignPatterns.ObserverDesignPattern.Observer.Observer;

public interface Observable {

    void add(Observer obj);
    void remove(Observer obj);
    void notifyObservers();
    void setData(double data);
    double getData();
}
