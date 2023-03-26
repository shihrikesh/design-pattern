package io.hrishi.gof.designPatterns.behaviour.decorator;

public class Whip extends CondimentDecorator{

    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public Double getCost() {
        return beverage.getCost()+.09;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
