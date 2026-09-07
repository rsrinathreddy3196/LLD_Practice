package DesignPatterns.StratergyDesignPattern.WithStratergyPattern.Strategy;

public class OffRoadStrategy implements DrivingStrategy{

    @Override
    public void drive() {
        System.out.println("Off-road drive logic");
    }

    @Override
    public void power() {
        System.out.println("Special power logic");
    }
}
