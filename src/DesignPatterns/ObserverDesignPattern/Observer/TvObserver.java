package DesignPatterns.ObserverDesignPattern.Observer;

import DesignPatterns.ObserverDesignPattern.Observable.Observable;

public class TvObserver implements Observer{
    public Observable observable;

    public TvObserver(Observable observable){
        this.observable=observable;
    }
    @Override
    public void update() {
        System.out.println("updated temperature is " + observable.getData() + " for Tv");
    }
}
