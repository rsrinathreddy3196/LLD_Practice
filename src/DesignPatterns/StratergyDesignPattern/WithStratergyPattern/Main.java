package DesignPatterns.StratergyDesignPattern.WithStratergyPattern;

public class Main {
    public static void main(String[] args){
        Vehicle v = new OffRoadVehicle();
        v.drive();
        v.power();
    }
}
