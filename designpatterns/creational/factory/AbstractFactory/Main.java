package designpatterns.creational.factory.AbstractFactory;

import designpatterns.creational.factory.AbstractFactory.Factory.FastFoodFactory;
import designpatterns.creational.factory.AbstractFactory.Factory.KingBurgerFactory;
import designpatterns.creational.factory.AbstractFactory.Product1.Burger;
import designpatterns.creational.factory.AbstractFactory.Product2.GarlicBread;

public class Main {
    public static void main(String[] args) {
        FastFoodFactory factory=new KingBurgerFactory();
        Burger myburger=factory.createBurger("simple");
        GarlicBread mybread=factory.createGarlicBread("simple");
        myburger.prepareBurger();
        mybread.prepareBread();

    }
}
