package io.hrishi.gof.designPatterns.creational.factory;

public class IOS implements OS {
    public IOS(){
        System.out.println("Android OS");
    }

    @Override
    public void spec() {
        System.out.println("this is Android open specifications");
    }
}
