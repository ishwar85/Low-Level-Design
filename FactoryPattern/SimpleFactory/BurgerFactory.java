package FactoryPattern.SimpleFactory;

public class BurgerFactory {
    public Burger createBurger(String type) {
        switch (type) {
            case "BASIC":return new BasicBurger();
            case "Standard": return new StandardBurger();
            case "Premium": return new PremiumBurger();
             default:
                 System.out.println("not a valid type");;
        }
        return null;
    }
}
