package io.hrishi.gof.designPatterns.creational.AbstractFactory;

public class AmexFactory implements CreditCardProviderService {

    @Override
    public CardService getCard(CardType cardType) {
        switch (cardType) {
            case GOLD:
                return new AmexGoldCardServiceImpl();
            case PLATINUM:
                return new AmexPlatinumCardServiceImpl();
            default:
                return null;
        }
    }
}
