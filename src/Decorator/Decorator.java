package Decorator;

public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    public Drink getDrink() {
        return drink;
    }

    @Override
    public float getPrice() {
        return price + drink.getPrice();
    }

    @Override
    public String getDescription() {
        return  drink.getDescription() + " && (" + description + " " + price + ")";
    }
}
