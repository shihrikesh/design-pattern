package io.hrishi.gof.designPatterns.creational.factory;

public class FactoryMain {
    public static void main(String[] args) {

        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();
        OS android = operatingSystemFactory.getInstance(SystemType.OPEN);
        android.spec();
        OS apple = operatingSystemFactory.getInstance(SystemType.OPEN);
        apple.spec();
        OS linux = operatingSystemFactory.getInstance(SystemType.OPEN);
        linux.spec();
    }
}
