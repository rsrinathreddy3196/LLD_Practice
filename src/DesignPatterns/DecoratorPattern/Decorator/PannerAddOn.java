package DesignPatterns.DecoratorPattern.Decorator;

import DesignPatterns.DecoratorPattern.Base.BasePizza;

public class PannerAddOn extends ToppingsDecorator{

    public int pannerCost;
    public PannerAddOn(BasePizza pizza ,int cost){
        super(pizza);
        this.pannerCost=cost;
    }
    @Override
   public int cost() {
        return pizza.cost() + pannerCost;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " extra panner";
    }

    @Override
    public int getAddOnCost() {
        return pizza.getAddOnCost() + pannerCost;
    }
}
