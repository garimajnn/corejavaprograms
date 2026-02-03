package designpatterns.behavioural.strategy;

public class Checkout {
    private PaymentService paymentService;
    public Checkout(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    void pay(){
        paymentService.pay();
    }
}
