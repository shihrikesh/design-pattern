package io.hrishi.gof.designPatterns.creational.AbstractFactory;

public class AmexPlatinumCardServiceImpl implements CardService{

    public AmexPlatinumCardServiceImpl(){
        System.out.println("Platinum Card");
    }

    @Override
    public void getCard() {
        System.out.println("AmexPlatinum Card");
    }
}
