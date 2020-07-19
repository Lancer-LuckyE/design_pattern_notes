package Decorator;

public class Client {
    public static void main(String[] args) {
        Drink order1 = new Cappuccino();
        System.out.println("Cappuccino: " + order1.getDescription() + "  " + order1.getPrice());

        order1 = new Milk(order1);
        System.out.println("Cappuccino with Milk: " + order1.getDescription() + "  " + order1.getPrice());

        order1 = new Cream(order1);
        System.out.println("Cappuccino with Mile and Cream: " + order1.getDescription() + "  " + order1.getPrice());
    }
}
