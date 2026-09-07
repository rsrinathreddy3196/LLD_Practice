package DesignPatterns.FactoryDesignPattern.AbstractFactory;

public class WinFactory implements GUiFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
