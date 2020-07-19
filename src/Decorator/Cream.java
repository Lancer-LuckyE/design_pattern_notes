package Decorator;

public class Cream extends Decorator {
    public Cream(Drink drink) {
        super(drink);
        setDescription("Cream;");
        setPrice(0.5f);
    }
}
