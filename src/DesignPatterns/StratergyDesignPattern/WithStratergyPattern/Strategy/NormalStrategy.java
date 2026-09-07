package DesignPatterns.StratergyDesignPattern.WithStratergyPattern.Strategy;

public class NormalStrategy implements DrivingStrategy{

    @Override
    public void drive() {
        System.out.println("Goods drive logic");
    }

    @Override
    public void power() {
        System.out.println("Normal power logic");
    }
}
