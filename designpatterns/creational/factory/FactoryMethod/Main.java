package designpatterns.creational.factory.FactoryMethod;

/**
 * FActory method defines an interface for creating the object but allows subclass to decide which object
 * to instantiate
 * */

public class Main {
    public static void main(String[] args) {
        FactoryMethod burger=new KingBurger();
       Burger   myBurger=burger.createBurger("basic");
       myBurger.prepareBurger();

    }
}
