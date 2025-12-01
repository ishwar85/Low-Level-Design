package StrategyPattern;

public class StrategyRunnerClass {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setPaymentStrategy(new CreditCardPayment());
        paymentContext.payment(50);
    }

}
