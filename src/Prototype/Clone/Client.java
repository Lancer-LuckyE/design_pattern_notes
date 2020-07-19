package Prototype.Clone;

public class Client {
    //使用clone来复制多个实例不需要改客户端的get来增加新加的属性
    //在naive approach里，假如Sheep新增一个属性，则需要修改客户端。在构造器中新增一个getter来实现。
    public static void main(String[] args) {
        Sheep sheep = new Sheep("Tom", "White", 1);
        Sheep sheep1 = sheep.clone();
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();
        Sheep sheep4 = sheep.clone();
        Sheep sheep5 = sheep.clone();

        System.out.println(sheep + "\n");
        System.out.println(sheep1 + "\n");
        System.out.println(sheep2 + "\n");
        System.out.println(sheep3 + "\n");
        System.out.println(sheep4 + "\n");
        System.out.println(sheep5 + "\n");

//        Naive Approach
//        Sheep sheep = new Sheep("Tom", "White", 1);
//        Sheep cloneSheep = new Sheep(sheep.getName(), sheep.getColor(), sheep.getAge());
    }
}
