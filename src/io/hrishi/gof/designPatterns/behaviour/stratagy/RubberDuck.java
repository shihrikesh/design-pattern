package io.hrishi.gof.designPatterns.behaviour.stratagy;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehaviour = new Squeak();
        flyBehaviour = new NoFLy();
    }
    @Override
    void display() {
        System.out.println("This is RubberDuck");
    }
}
