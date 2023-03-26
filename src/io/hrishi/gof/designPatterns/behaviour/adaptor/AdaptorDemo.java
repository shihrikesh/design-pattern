package io.hrishi.gof.designPatterns.behaviour.adaptor;

public class AdaptorDemo {
    public static void main(String[] args) {

        Turkey turkey = new WildTurkey();
        Duck turkeyAdaptor = new TurkeyAdaptor(turkey);
        turkeyAdaptor.quack();
        turkeyAdaptor.fly();
    }
}
