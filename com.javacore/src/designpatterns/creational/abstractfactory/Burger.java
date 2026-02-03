package designpatterns.creational.abstractfactory;

public class Burger implements MainCourse{
    @Override
    public void getMainCourse() {
        System.out.println("Aaloo Burger");
    }
}
