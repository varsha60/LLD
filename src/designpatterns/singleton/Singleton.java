package designpatterns.singleton;

public class Singleton {

    private static Singleton singletonInstance;

    private static Singleton synchronizedSingletonInstance;



    private Singleton () {

    }

    public static Singleton getSingletonObject () {

        if (singletonInstance == null) {
            singletonInstance =  new Singleton();
        }

        return singletonInstance;

    }

    public static Singleton getSingletonSyncObject () {
        if (synchronizedSingletonInstance == null) {
            synchronized (Singleton.class) {
                if (synchronizedSingletonInstance == null) {
                    synchronizedSingletonInstance = new Singleton();
                }
            }
        }

        return synchronizedSingletonInstance;
    }
}
