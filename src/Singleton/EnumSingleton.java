package Singleton;

public class EnumSingleton {
    enum EnumSingletonInit {
        INSTANCE;
        public static void printInstance(){
            System.out.println(INSTANCE.hashCode());
        }
    }

    public static void main(String[] args){
        EnumSingletonInit enumSingleton1 = EnumSingletonInit.INSTANCE;
        enumSingleton1.printInstance();
        System.out.println(enumSingleton1.hashCode());

        EnumSingletonInit enumSingleton2 = EnumSingletonInit.INSTANCE;
        enumSingleton2.printInstance();
        System.out.println(enumSingleton2.hashCode());
    }
}
