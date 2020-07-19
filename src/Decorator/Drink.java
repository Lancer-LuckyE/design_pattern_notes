package Decorator;

public abstract class Drink {
    protected String description;
    protected float price;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float getPrice();
    public abstract String getDescription();
}
