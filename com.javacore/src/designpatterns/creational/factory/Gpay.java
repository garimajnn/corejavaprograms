package designpatterns.creational.factory;

public class Gpay implements Payment{
    public void pay(double amount){
        System.out.println("Payment is done via gpay");
    }
}
