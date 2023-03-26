package io.hrishi.gof.designPatterns.behaviour.decorator;

public class BlackCoffee extends Beverage{
    public BlackCoffee(){
        description = "This is Black Coffee";
    }

    @Override
    public Double getCost() {
        return .99;
    }
}
