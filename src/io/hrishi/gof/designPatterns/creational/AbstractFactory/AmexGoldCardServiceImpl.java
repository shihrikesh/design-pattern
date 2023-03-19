package io.hrishi.gof.designPatterns.creational.AbstractFactory;

public class AmexGoldCardServiceImpl implements CardService{

    public AmexGoldCardServiceImpl(){
        System.out.println("Gold Card");
    }

    @Override
    public void getCard() {
        System.out.println("AmexGold Card");
    }
}
