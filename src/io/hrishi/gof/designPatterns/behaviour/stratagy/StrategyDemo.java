package io.hrishi.gof.designPatterns.behaviour.stratagy;

public class StrategyDemo {
    public static void main(String[] args) {

        Duck duck = new ShootingDuck();
        duck.display();
        duck.swim();
        duck.performQuack();
        duck.performFly();

        duck = new MallardDuck();
        duck.display();
        duck.swim();
        duck.performQuack();
        duck.performFly();

        duck = new RubberDuck();
        duck.display();
        duck.swim();
        duck.performQuack();
        duck.performFly();

        duck = new RedDuck();
        duck.display();
        duck.swim();
        duck.performQuack();
        duck.performFly();


    }
}
