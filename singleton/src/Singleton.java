public class Singleton {
    private static volatile Singleton singleton;
    private Singleton() {
        System.out.println("Create singleton");
    }

    public static Singleton getInstance() {
        Singleton result = singleton;
        if (result != null) {
            return result;
        }
        synchronized(Singleton.class) {
            if (singleton == null) {
                singleton = new Singleton();
            }
            return singleton;
        }
    }
}
