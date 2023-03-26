package io.hrishi.gof.designPatterns.behaviour.decorator;

public abstract class Beverage {
    public String description = "Unknown Drink";
    public String getDescription(){
        return description;
    }
    public abstract Double getCost();
}
