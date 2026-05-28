package designpatterns.creational.factory;

public class CreditCard implements Payment {
public void pay(double amt){
    System.out.println("payment is done via creditcard");
}
}
