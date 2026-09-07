package DesignPatterns.DecoratorPattern.Base;

public class Marigenta implements BasePizza{

    public int marigentaCost;
    public Marigenta(int cost){
        this.marigentaCost=cost;
    }
    @Override
    public int cost() {
        return marigentaCost;
    }

    @Override
    public String getDescription() {
        return "Marigenta pizza";
    }

    @Override
    public int getAddOnCost() {
        return 0;
    }
}
