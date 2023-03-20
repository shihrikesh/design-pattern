package io.hrishi.gof.designPatterns.behaviour.stratagy;

public class Mute implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("This duck does not Quack");
    }
}
