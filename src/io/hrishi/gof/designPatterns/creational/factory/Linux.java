package io.hrishi.gof.designPatterns.creational.factory;

public class Linux implements OS {
    public Linux(){
        System.out.println("Android OS");
    }

    @Override
    public void spec() {
        System.out.println("this is IOS closed and secure specifications");
    }
}
