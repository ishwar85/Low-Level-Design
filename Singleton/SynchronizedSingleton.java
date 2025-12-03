package Singleton;

public class SynchronizedSingleton {

    private static SynchronizedSingleton instance;

    private SynchronizedSingleton(){}
    synchronized public SynchronizedSingleton getInstance(){
        if(instance==null){
                instance = new SynchronizedSingleton();
        }
        return instance;
    }
}


/*
Thread safe but whole method isnlocked for different threds even object is created before
to handle this will have to checkk
 */