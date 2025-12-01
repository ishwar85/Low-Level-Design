package StrategyPattern;

public class PaymentContext {
    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void payment(int amount) {
        paymentStrategy.pay(amount);
    }
}
