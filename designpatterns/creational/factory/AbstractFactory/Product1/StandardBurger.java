package designpatterns.creational.factory.AbstractFactory.Product1;

public class StandardBurger implements Burger{
    public void prepareBurger(){
        System.out.println("Standard burger is ready");
    }
}
