package io.hrishi.gof.designPatterns.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {

        //lazy initialization
        SingletonLazy singletonLazy = SingletonLazy.getSingletonInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getSingletonInstance();
        System.out.println(singletonLazy);
        System.out.println(singletonLazy2);

        // early initialization
        SingletonEarly singletonEarly = SingletonEarly.getSingletonEarly();
        System.out.println(singletonEarly);
    }
}
