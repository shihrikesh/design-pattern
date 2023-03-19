package io.hrishi.gof.designPatterns.creational.AbstractFactory;

public class VisaGoldCardServiceImpl implements CardService{

    public VisaGoldCardServiceImpl(){
        System.out.println("Gold Card");
    }

    @Override
    public void getCard() {
        System.out.println("VisaGold Card");
    }
}
