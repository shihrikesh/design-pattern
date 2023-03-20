package io.hrishi.gof.designPatterns.behaviour.stratagy;

public class FlyWithWings implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("This duck Flies With Wings");
    }
}
