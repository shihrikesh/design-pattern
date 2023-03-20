package io.hrishi.gof.designPatterns.behaviour.stratagy;

public class Squeak implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("This duck Squeak");
    }
}
