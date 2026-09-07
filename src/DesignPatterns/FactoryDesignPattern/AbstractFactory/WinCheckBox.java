package DesignPatterns.FactoryDesignPattern.AbstractFactory;

public class WinCheckBox implements CheckBox{

    @Override
    public void paint() {
        System.out.println("Rendering windows checkbox..");
    }
}
