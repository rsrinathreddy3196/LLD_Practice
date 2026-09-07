package DesignPatterns.FactoryDesignPattern.AbstractFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Application app;
        GUiFactory factory;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter os name");
        String osName = sc.next();

        if(osName.contains("mac")){
            factory= new MacFactory();
        }else{
            factory=new WinFactory();
        }

        app = new Application(factory);
        app.paint();
    }
}
