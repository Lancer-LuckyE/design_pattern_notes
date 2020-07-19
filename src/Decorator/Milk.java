package Decorator;

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        setDescription("Milk");
        setPrice(0.25f);
    }
}
