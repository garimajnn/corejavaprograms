package designpatterns.creational.factory.AbstractFactory.Factory;

import designpatterns.creational.factory.AbstractFactory.Product1.Burger;
import designpatterns.creational.factory.AbstractFactory.Product1.SimpleBurger;
import designpatterns.creational.factory.AbstractFactory.Product2.GarlicBread;
import designpatterns.creational.factory.AbstractFactory.Product2.SimpleGarlicBread;

public class KingBurgerFactory implements FastFoodFactory{
  public Burger createBurger(String type){
      if(type.equalsIgnoreCase("simple")){
          return new SimpleBurger();
      }

      else{
          throw new IllegalArgumentException("Not avail");
      }
  }
    public GarlicBread createGarlicBread(String type){
      if(type.equalsIgnoreCase("simple")){
          return new SimpleGarlicBread();
      }
      else{
          throw new IllegalArgumentException("Not avail");
      }
    }
}
