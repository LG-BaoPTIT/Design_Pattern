package Singleton_Design_pattern;

public class ThreadSafe {
    private static volatile ThreadSafe INSTANCE;

    private ThreadSafe(){};

    private static synchronized ThreadSafe getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ThreadSafe();
        }
        return INSTANCE;
    }
}
