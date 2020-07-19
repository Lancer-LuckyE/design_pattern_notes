package Singleton;

public class LazyInit {
    private static LazyInit instance;

    private LazyInit(){}

    public static LazyInit getInstance() {
        if (instance == null) {
            instance = new LazyInit();
        }
        return instance;
    }
}
