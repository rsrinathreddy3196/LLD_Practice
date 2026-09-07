package DesignPatterns.StratergyDesignPattern.WithoutStratergyPattern;

public class SportVehicle extends Vehicle{

    @Override
    public void drive() {
        System.out.println("I have my own drive logic same as off-road");
    }
}
