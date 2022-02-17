package singleton;

public class LazySingletonMain {

    public static void main(String[] args) {
        LazySingleton mySingleton = LazySingleton.getInstance();

        System.out.println(mySingleton);

        mySingleton = LazySingleton.getInstance();

        System.out.println(mySingleton);
    }
}
