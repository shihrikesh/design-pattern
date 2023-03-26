package io.hrishi.gof.designPatterns.behaviour.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {

        Beverage beverage = new BlackCoffee();
        beverage = new Whip(beverage);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        System.out.println(beverage.getCost());
    }
}
