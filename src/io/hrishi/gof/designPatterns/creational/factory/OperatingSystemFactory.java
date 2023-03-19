package io.hrishi.gof.designPatterns.creational.factory;

public class OperatingSystemFactory {

    public OS getInstance(SystemType systemType) {
        switch (systemType) {
            case OPEN:
                return new Android();
            case CLOSED:
                return new IOS();
            case SECURE:
                return new Linux();
            default:
                return null;
        }
    }
}
