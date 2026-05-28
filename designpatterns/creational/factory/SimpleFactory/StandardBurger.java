package designpatterns.creational.factory.SimpleFactory;

public class StandardBurger implements Burger{
    public void prepareBurger(){
        System.out.println("Standard Burger is ready");
    }
}
