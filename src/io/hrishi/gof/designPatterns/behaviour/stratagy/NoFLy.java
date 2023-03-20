package io.hrishi.gof.designPatterns.behaviour.stratagy;

public class NoFLy implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("This duck does not Fly");
    }
}
