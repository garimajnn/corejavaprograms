package designpatterns.behavioural.strategy;

public class CreditCard implements PaymentService{
    public void pay(){
        System.out.println("payment is done via creditcard");
    }
}
