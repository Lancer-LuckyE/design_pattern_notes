package Decorator;

public class Coffee extends Drink{
    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
