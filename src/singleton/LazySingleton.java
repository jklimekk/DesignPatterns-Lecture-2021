package singleton;

public class LazySingleton {
    private volatile static LazySingleton singleton = null;

    private LazySingleton(){}; // important!

    public static LazySingleton getInstance() {
        if(singleton == null) { // multi-thread
            synchronized (LazySingleton.class) {
                if(singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }

        return singleton;
    }
}

// eager version
class EagerSingleton {
    private static EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton(){};

    public static EagerSingleton getInstance() {
        return singleton;
    }
}


// best version
class AnotherSingleton {

    private AnotherSingleton(){};

    public static AnotherSingleton getInstance() {
        return SingletonHelper.singleton;
    }

    private class SingletonHelper {
        private static final AnotherSingleton singleton = new AnotherSingleton();
    }
}
