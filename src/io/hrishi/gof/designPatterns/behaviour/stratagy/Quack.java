package io.hrishi.gof.designPatterns.behaviour.stratagy;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("This duck Quacks");
    }
}
