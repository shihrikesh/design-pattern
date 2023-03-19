package io.hrishi.gof.designPatterns.creational.factory;

public class Android implements OS {
    public Android(){
        System.out.println("Android OS");
    }

    @Override
    public void spec() {
        System.out.println("this is Android open specifications");
    }
}
