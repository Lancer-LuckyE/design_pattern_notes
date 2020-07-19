package Prototype.DeepClone;


public class Client {
    public static void main(String[] args) {
//        浅拷贝对于基本数据类型是直接拷贝值
//        但对于对象的成员变量是数组或者对象时，会直接传递引用。
//        Sheep sheep = new Sheep("Tom", "White", 1);
//        sheep.setFriend(new Sheep("Jacky", "Black", 2));
//
//        Sheep sheep1 = sheep.clone();
//        Sheep sheep2 = sheep.clone();
//
//        System.out.println("Sheep: " + sheep);
//        System.out.println(sheep.printFriendAddress());
//        System.out.println("The followings are cloned objs:\n");
//        System.out.println("Sheep1: " + sheep1);
//        System.out.println(sheep1.printFriendAddress());
//        System.out.println("Sheep2: " + sheep2);
//        System.out.println(sheep2.printFriendAddress());

//        deep clone
//        DeepCloneSheep deepCloneSheep = new DeepCloneSheep("Tommy", "Gray", 1);
//        deepCloneSheep.setFriend(new DeepCloneSheep("Jacky", "Black", 2));
//
//        DeepCloneSheep deepCloneSheep1 = deepCloneSheep.clone();
//        DeepCloneSheep deepCloneSheep2 = deepCloneSheep.clone();
//
//        System.out.println("Sheep: " + deepCloneSheep);
//        System.out.println("Sheep friend: " + deepCloneSheep.getFriend());
//        System.out.println(deepCloneSheep.printFriendAddress());
//        System.out.println("The followings are cloned objs:\n");
//        System.out.println("Sheep1: " + deepCloneSheep1);
//        System.out.println("Sheep1 friend: " + deepCloneSheep.getFriend());
//        System.out.println(deepCloneSheep1.printFriendAddress());
//        System.out.println("Sheep2: " + deepCloneSheep2);
//        System.out.println("Sheep2 friend: " + deepCloneSheep.getFriend());
//        System.out.println(deepCloneSheep2.printFriendAddress());

        DeepCloneSheep deepCloneSheep = new DeepCloneSheep("Tommy", "Gray", 1);
        deepCloneSheep.setFriend(new DeepCloneSheep("Jacky", "Black", 2));

        DeepCloneSheep deepCloneSheep1 = (DeepCloneSheep) deepCloneSheep.deepClone();
        DeepCloneSheep deepCloneSheep2 = (DeepCloneSheep) deepCloneSheep.deepClone();

        System.out.println("Sheep: " + deepCloneSheep);
        System.out.println("Sheep friend: " + deepCloneSheep.getFriend());
        System.out.println(deepCloneSheep.printFriendAddress());
        System.out.println("The followings are cloned objs:\n");
        System.out.println("Sheep1: " + deepCloneSheep1);
        System.out.println("Sheep1 friend: " + deepCloneSheep.getFriend());
        System.out.println(deepCloneSheep1.printFriendAddress());
        System.out.println("Sheep2: " + deepCloneSheep2);
        System.out.println("Sheep2 friend: " + deepCloneSheep.getFriend());
        System.out.println(deepCloneSheep2.printFriendAddress());

//        原型模式有个缺点：对于原本不支持克隆的类，没办法在不修改代码的基础上实现，必须修改原来的类。
//        违反了o/c原则
    }
}
