package DesignPatterns.ObserverDesignPattern;

import DesignPatterns.ObserverDesignPattern.Observable.Observable;
import DesignPatterns.ObserverDesignPattern.Observable.WeatherStationObservable;
import DesignPatterns.ObserverDesignPattern.Observer.MobileObserver;
import DesignPatterns.ObserverDesignPattern.Observer.Observer;
import DesignPatterns.ObserverDesignPattern.Observer.TvObserver;

public class Main {

    public static void main(String[] args) {

        Observable weatherStationObservable = new WeatherStationObservable();
        Observer mobileObserver = new MobileObserver(weatherStationObservable);
        Observer tvObsever = new TvObserver(weatherStationObservable);

        weatherStationObservable.add(mobileObserver);
        weatherStationObservable.add(tvObsever);

        weatherStationObservable.setData(104.32);


    }
}
