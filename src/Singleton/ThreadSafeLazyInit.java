package Singleton;

public class ThreadSafeLazyInit {
    private static ThreadSafeLazyInit instance;
    private static volatile ThreadSafeLazyInit instanceDL;

    private ThreadSafeLazyInit(){}

    public static synchronized ThreadSafeLazyInit getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyInit();
        }
        return instance;
    }

    public static ThreadSafeLazyInit getInstanceDL() { // using double checked locking.
        if (instanceDL == null) {                      // after the first instance is created, they won't check synchronization and just return the instance.
            synchronized (ThreadSafeLazyInit.class) {  // only check synchronization at the first time threads trying to get access to the same block.
                if (instanceDL == null) {
                    instanceDL = new ThreadSafeLazyInit();
                }
            }
        }
        return instanceDL;
    }
}

