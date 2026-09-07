package DesignPatterns.FactoryDesignPattern.AbstractFactory;

public class MacFactory implements GUiFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
