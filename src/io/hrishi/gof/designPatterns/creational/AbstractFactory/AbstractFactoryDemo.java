package io.hrishi.gof.designPatterns.creational.AbstractFactory;

public class AbstractFactoryDemo {

    public static final Integer HIGH_CREDIT_SCORE = 685;
    public static final Integer LOW_CREDIT_SCORE = 620;
    public static void main(String[] args) {


        AbstractCreditCardFactory abstractCreditCardFactory = new AbstractCreditCardFactory();
        CreditCardProviderService creditCardProviderService = abstractCreditCardFactory.getProvider(HIGH_CREDIT_SCORE);
        CardService cardService = creditCardProviderService.getCard(CardType.GOLD);
        cardService.getCard();

        creditCardProviderService = abstractCreditCardFactory.getProvider(LOW_CREDIT_SCORE);
        cardService = creditCardProviderService.getCard(CardType.GOLD);
        cardService.getCard();
    }
}
