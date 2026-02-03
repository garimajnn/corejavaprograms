package designpatterns.creational.factory;

public class Cash implements Payment{
    public void pay(double amt){
        System.out.println("Payment is done via cash");
    }
}
