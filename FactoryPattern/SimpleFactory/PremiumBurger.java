package FactoryPattern.SimpleFactory;

public class PremiumBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Premium Burger prepared");
    }
}
