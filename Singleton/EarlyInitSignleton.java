package Singleton;

public class EarlyInitSignleton {
    static EarlyInitSignleton instance = new EarlyInitSignleton();
    private EarlyInitSignleton(){}
    public static EarlyInitSignleton getInstance(){
        return instance;
    }
}

/*
this is thread sade but its initilizing the object early
 */
