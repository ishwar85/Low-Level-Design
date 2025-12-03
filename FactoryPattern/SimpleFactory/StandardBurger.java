package FactoryPattern.SimpleFactory;

public class StandardBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("Standard Burger Prepared");
    }
}
