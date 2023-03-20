package io.hrishi.gof.designPatterns.behaviour.stratagy;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {

    }

    void performQuack() {
        quackBehaviour.quack();
    }

    void performFly() {
        flyBehaviour.fly();
    }

    abstract void display();

    void swim() {
        System.out.println("This Duck Swims");
    }
}
