package io.hrishi.gof.designPatterns.behaviour.decorator;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public Double getCost() {
        return beverage.getCost()+ .65;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
