package io.hrishi.gof.designPatterns.behaviour.stratagy;

public class RedDuck extends Duck {

    public RedDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    void display() {
        System.out.println("This is RedDuck");
    }
}
