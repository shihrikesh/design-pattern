package io.hrishi.gof.designPatterns.creational.singleton;

public class SingletonEarly {

    private static SingletonEarly singletonEarly = new SingletonEarly();

    private SingletonEarly(){

    }

    synchronized static SingletonEarly getSingletonEarly(){
        if (null == singletonEarly) {
            singletonEarly = new SingletonEarly();
        }
        return singletonEarly;
    }
}
