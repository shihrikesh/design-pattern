package io.hrishi.gof.designPatterns.behaviour.stratagy;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
    @Override
    void display() {
        System.out.println("This is Mallard Duck");
    }
}
