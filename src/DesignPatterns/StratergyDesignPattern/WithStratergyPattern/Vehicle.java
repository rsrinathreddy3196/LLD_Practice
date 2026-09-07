package DesignPatterns.StratergyDesignPattern.WithStratergyPattern;

import DesignPatterns.StratergyDesignPattern.WithStratergyPattern.Strategy.DrivingStrategy;

public class Vehicle {

    DrivingStrategy drivingStrategy;

    Vehicle(DrivingStrategy drivingStrategy){
        this.drivingStrategy = drivingStrategy;
    }

    public void drive(){
        drivingStrategy.drive();
    }

    public void power(){
        drivingStrategy.power();
    }
}
