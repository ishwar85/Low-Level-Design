package Singleton;

public class RunnerClass {
    public static void main(String[] args) {
        SimpleSingleTon simpleSingleTon = SimpleSingleTon.getInstance();
        System.out.println(simpleSingleTon);
        SimpleSingleTon s2 = SimpleSingleTon.getInstance();
        System.out.println(s2);
    }


}
