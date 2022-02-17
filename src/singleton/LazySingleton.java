package singleton;

public class LazySingleton {
    private volatile static LazySingleton singleton = null;

    // pamietac o pustym konstruktorze w tej wersji!
    private LazySingleton(){};

    public static LazySingleton getInstance() {
        if(singleton == null) { // wielowatkowo
            synchronized (LazySingleton.class) {
                if(singleton == null) {
                    singleton = new LazySingleton();
                }
            }
        }

        return singleton;
    }
}

// chciwa wersja
//public class Singleton {
//    private static Singleton singleton = new Singleton();
//
//    // pamietac o pustym konstruktorze w tej wersji!
//    private Singleton(){};
//
//    public static Singleton getInstance() {
//        return singleton;
//    }
//}


//najlepsza wersja
//public class Singleton {
//
//    // pamietac o pustym konstruktorze w tej wersji!
//    private Singleton(){};
//
//    public static Singleton getInstance() {
//        return SingletonHelper.singleton;
//    }
//
//    private class SingletonHelper {
//        private static final Singleton singleton = new Singleton();
//    }
//}
