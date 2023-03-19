package io.hrishi.gof.designPatterns.creational.AbstractFactory;

public interface CreditCardProviderService {

    default CreditCardProviderService getProvider(Integer creditScore){
        if (creditScore >650){
            return new AmexFactory();
        } else return new VisaFactory();
    }
    CardService getCard(CardType cardType);
}
