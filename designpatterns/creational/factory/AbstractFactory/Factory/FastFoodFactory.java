package designpatterns.creational.factory.AbstractFactory.Factory;

import designpatterns.creational.factory.AbstractFactory.Product1.Burger;
import designpatterns.creational.factory.AbstractFactory.Product2.GarlicBread;

public interface FastFoodFactory {
    Burger createBurger(String type);
    GarlicBread createGarlicBread(String type);

}
