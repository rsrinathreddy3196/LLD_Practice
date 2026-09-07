package DesignPatterns.StratergyDesignPattern.WithStratergyPattern;

import DesignPatterns.StratergyDesignPattern.WithStratergyPattern.Strategy.OffRoadStrategy;

public class SportVehicle extends Vehicle{

    SportVehicle(){
        super(new OffRoadStrategy());
    }
}
