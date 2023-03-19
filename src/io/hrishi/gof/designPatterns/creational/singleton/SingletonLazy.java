package io.hrishi.gof.designPatterns.creational.singleton;

public class SingletonLazy {

    private static SingletonLazy singleton = null;

    private SingletonLazy() {

    }

    synchronized static SingletonLazy getSingletonInstance() {
        if (null == singleton) {
            singleton = new SingletonLazy();
        }
        return singleton;
    }
}
