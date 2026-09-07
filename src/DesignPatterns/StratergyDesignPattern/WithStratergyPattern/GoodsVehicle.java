package DesignPatterns.StratergyDesignPattern.WithStratergyPattern;

import DesignPatterns.StratergyDesignPattern.WithStratergyPattern.Strategy.NormalStrategy;

public class GoodsVehicle extends Vehicle{

    GoodsVehicle(){
        super(new NormalStrategy());
    }
}
