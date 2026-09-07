package DesignPatterns.DecoratorPattern.Base;

public class VegDelight implements BasePizza{

    public int vegDelightCost;

    public VegDelight(int cost){
        this.vegDelightCost=cost;
    }
    @Override
    public int cost() {
        return vegDelightCost;
    }

    @Override
    public String getDescription() {
        return "Veg delight pizza";
    }

    @Override
    public int getAddOnCost() {
        return 0;
    }
}
