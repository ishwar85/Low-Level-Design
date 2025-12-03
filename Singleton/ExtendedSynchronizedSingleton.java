package Singleton;

public class ExtendedSynchronizedSingleton {
    
    private static volatile ExtendedSynchronizedSingleton instance;
    private ExtendedSynchronizedSingleton(){}

    public static  ExtendedSynchronizedSingleton getInstance(){
        if(instance==null){
            synchronized (ExtendedSynchronizedSingleton.class){
                if(instance==null){
                    instance = new ExtendedSynchronizedSingleton();
                }
            }
        }
        return instance;
    }
    
}
