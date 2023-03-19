package io.hrishi.gof.designPatterns.creational.AbstractFactory;

public class VisaFactory implements CreditCardProviderService {
    public CardService getCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCardServiceImpl();
            case PLATINUM:
                return new VisaPlatinumCardServiceImpl();
            default:
                return null;
        }

    }
}
