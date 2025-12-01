package StrategyPattern;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paying amount via creditCard amount: "+amount);
    }
}
