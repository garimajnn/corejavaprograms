package oops.payment;

// Paypal implement the Payment
public class PayPal implements Payment {
    public void pay(double amount){
        System.out.println("Payment done using paypal" +amount);
    }
}
