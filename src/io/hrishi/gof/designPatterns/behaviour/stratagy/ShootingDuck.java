package io.hrishi.gof.designPatterns.behaviour.stratagy;

public class ShootingDuck extends Duck{


    public ShootingDuck() {
        quackBehaviour = new Mute();
        flyBehaviour = new NoFLy();
    }
    @Override
    void display() {
        System.out.println("This is Shooting Duck");
    }
}
