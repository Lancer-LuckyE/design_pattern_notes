package Prototype.Clone;

public class Sheep implements Cloneable{
    private String name;
    private String color;
    private int age;

    public Sheep(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Sheep: [name: " + getName() + ", age: " + getAge() + ", color: " + getColor() + "];";
    }

    @Override
    protected Sheep clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
