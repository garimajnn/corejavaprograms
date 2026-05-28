package designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {

        // jab client mera getInstance() ko call krega tb mujhe object milega
        // lazy initialisation

        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        System.out.println(lazySingleton1 == lazySingleton);
    }
}
