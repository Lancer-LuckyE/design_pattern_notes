package Singleton;

public class StaticInnerClass {
    private StaticInnerClass(){}
    private static class InnerClass {
        private final static StaticInnerClass INSTANCE = new StaticInnerClass();
    }
    public static StaticInnerClass getInstance() {
        return InnerClass.INSTANCE;
    }
}
