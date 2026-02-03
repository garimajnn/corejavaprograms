package designpatterns.behavioural.strategy;

public class PayPal implements PaymentService{
   public void pay(){
       System.out.println("Payment is done through paypal");
    }
}
