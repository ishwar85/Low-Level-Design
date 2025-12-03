package FactoryPattern.SimpleFactory;

public class BasicBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("basic burger prepared");
    }
}
