package DesignPatterns.DecoratorPattern.Decorator;

import DesignPatterns.DecoratorPattern.Base.BasePizza;

public class CheeseAddOn extends ToppingsDecorator{

    public int cheeseCost;
    public CheeseAddOn(BasePizza pizza, int cost){
        super(pizza);
        this.cheeseCost=cost;
    }
    @Override
    public int cost() {
        return pizza.cost() + cheeseCost;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " cheese pizza";
    }

    @Override
    public int getAddOnCost() {
        return pizza.getAddOnCost() + cheeseCost;
    }
}
