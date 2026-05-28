package designpatterns.behavioural.strategy;

public class DebitCard implements PaymentService{
    public void pay(){
        System.out.println("payment is done via debitcard");
    }

}
