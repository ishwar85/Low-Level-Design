package Singleton;

public class SimpleSingleTon {

    private static SimpleSingleTon instance;
    private SimpleSingleTon(){

    }
    public static  SimpleSingleTon getInstance(){
        if(instance==null){
            instance = new SimpleSingleTon();
        }
        return instance;
    }
}

/*
this is having issues it will not work in multithreaded env
 */
