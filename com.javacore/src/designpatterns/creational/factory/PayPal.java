package designpatterns.creational.factory;

public class PayPal implements Payment{
    public void pay(double amount){
        System.out.println("payment is done via paypal");
    }
}
