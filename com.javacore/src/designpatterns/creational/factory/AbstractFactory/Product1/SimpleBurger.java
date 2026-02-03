package designpatterns.creational.factory.AbstractFactory.Product1;

public class SimpleBurger implements Burger{
    public void prepareBurger(){
        System.out.println("Simple burger is ready");
    }
}
