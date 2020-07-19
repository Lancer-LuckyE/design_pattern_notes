package Singleton;

public class StaticBlockInit {
    private static StaticBlockInit instance;

    private StaticBlockInit(){}

    static {
        try {
            instance = new StaticBlockInit();
        } catch (Exception e) {
            System.err.println(e);
            throw new RuntimeException("Exception occurs in creating new instance.");
        }
    }

    public static StaticBlockInit getInstance() {
        return instance;
    }
}
