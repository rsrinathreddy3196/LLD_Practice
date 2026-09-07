package DesignPatterns.DecoratorPattern;

import DesignPatterns.DecoratorPattern.Base.BasePizza;
import DesignPatterns.DecoratorPattern.Base.Marigenta;
import DesignPatterns.DecoratorPattern.Base.VegDelight;
import DesignPatterns.DecoratorPattern.Decorator.CheeseAddOn;
import DesignPatterns.DecoratorPattern.Decorator.PannerAddOn;

public class Test {

    public static void main(String[] args) {

        BasePizza pizza1 = new Marigenta(12);
        System.out.println("" +
                "order is ready" + " please find details below \n"
                + pizza1.getDescription() + " cost - " + pizza1.cost() + "\n"
                + "-----------------\n"
                + "total - " + pizza1.cost());

        System.out.println();

        BasePizza pizza2 = new VegDelight(15);
        System.out.println("" +
                "order is ready" + " please find details below \n"
                + pizza2.getDescription() + " cost - " + pizza2.cost() + "\n"
                + "-----------------\n"
                + "total - " + pizza2.cost());

        System.out.println();

        BasePizza pizza3 = new PannerAddOn(new VegDelight(pizza2.cost()),20);
        System.out.println("" +
                "order is ready" + " please find details below \n"
                + pizza3.getDescription() + " cost - " + pizza3.cost() + "\n"
                + "panner add on cost " + pizza3.getAddOnCost() + "\n"
                + "-----------------\n"
                + "total - " + pizza3.cost());

        System.out.println();

        BasePizza pizza4 = new CheeseAddOn(new Marigenta(pizza1.cost()),25);
        System.out.println("" +
                "order is ready" + " please find details below \n"
                + pizza4.getDescription() + pizza4.cost() + "\n"
                + "cheese add on cost " + pizza4.getAddOnCost() + "\n"
                + "-----------------\n"
                + "total - " + pizza4.cost());

    }
}
