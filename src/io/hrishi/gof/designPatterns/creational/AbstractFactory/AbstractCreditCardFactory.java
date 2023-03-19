package io.hrishi.gof.designPatterns.creational.AbstractFactory;

public class AbstractCreditCardFactory implements CreditCardProviderService  {


    @Override
    public CreditCardProviderService getProvider(Integer creditScore) {
        return CreditCardProviderService.super.getProvider(creditScore);
    }

    @Override
    public CardService getCard(CardType cardType) {
        return null;
    }
}
