package DesignPatterns.FactoryDesignPattern.NormalFactory;

public class ShapeFactory {

    Shape getShape(String shape){

        switch (shape){
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
