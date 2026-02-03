package designpatterns.behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentFactory=PaymentFactory.getPaymentStrategy("gpay");
        Checkout checkout=new Checkout(paymentFactory);
        checkout.pay();
    }
}
