package DesignPatterns.FactoryDesignPattern.AbstractFactory;

public class MacButton implements Button{
    @Override
    public void paint() {
        System.out.println("Rendering mac button....");
    }
}
