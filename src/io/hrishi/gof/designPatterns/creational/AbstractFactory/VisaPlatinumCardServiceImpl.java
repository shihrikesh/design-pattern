package io.hrishi.gof.designPatterns.creational.AbstractFactory;

public class VisaPlatinumCardServiceImpl implements CardService{

    public VisaPlatinumCardServiceImpl(){
        System.out.println("Platinum Card");
    }

    @Override
    public void getCard() {
        System.out.println("VisaPlatinum Card");
    }
}
