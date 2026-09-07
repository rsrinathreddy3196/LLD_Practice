package DesignPatterns.FactoryDesignPattern.AbstractFactory;

public class MacCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Rendering mac checkbox...");
    }
}
