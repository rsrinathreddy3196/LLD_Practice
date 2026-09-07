package DesignPatterns.StratergyDesignPattern.WithStratergyPattern;

import DesignPatterns.StratergyDesignPattern.WithStratergyPattern.Strategy.OffRoadStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle(){
        super(new OffRoadStrategy());
    }
}
