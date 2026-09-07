package DesignPatterns.FactoryDesignPattern.NormalFactory;

public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("asdsa");
        shape.draw();

    }
}
