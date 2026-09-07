package DesignPatterns.DecoratorPattern.Decorator;

import DesignPatterns.DecoratorPattern.Base.BasePizza;

public abstract class ToppingsDecorator implements BasePizza {

    BasePizza pizza;

    public ToppingsDecorator(BasePizza pizza){
        this.pizza=pizza;
    }
}
