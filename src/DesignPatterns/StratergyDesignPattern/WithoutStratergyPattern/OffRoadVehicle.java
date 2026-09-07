package DesignPatterns.StratergyDesignPattern.WithoutStratergyPattern;

public class OffRoadVehicle extends Vehicle{

    @Override
    public void drive() {
        System.out.println("I have my own drive logic same as sport");
    }
}
