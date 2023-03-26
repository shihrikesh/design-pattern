package io.hrishi.gof.designPatterns.behaviour.adaptor;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("This gobbles");
    }

    @Override
    public void fly() {
        System.out.println("This flies");
    }
}
