package designpatterns.creational.abstractfactory;

public class Shake implements Drink{
    @Override
    public void getDrink() {
        System.out.println("Shake ");
    }
}
