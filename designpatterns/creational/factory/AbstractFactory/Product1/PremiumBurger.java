package designpatterns.creational.factory.AbstractFactory.Product1;

public class PremiumBurger implements Burger{
    public void prepareBurger(){
        System.out.println("Premium burger is ready");
    }
}
