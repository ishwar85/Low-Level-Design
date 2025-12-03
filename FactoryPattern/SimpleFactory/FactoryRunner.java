package FactoryPattern.SimpleFactory;

public class FactoryRunner {
    public static void main(String[] args) {
        BurgerFactory factory = new BurgerFactory();
        Burger burger = factory.createBurger("Premium");
        burger.prepare();
    }

}
