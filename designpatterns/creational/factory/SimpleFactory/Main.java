package designpatterns.creational.factory.SimpleFactory;

public class Main {
    public static void main(String[] args) {
        Burger burger=Factory.createBurger("standard");
        burger.prepareBurger();
    }
}
