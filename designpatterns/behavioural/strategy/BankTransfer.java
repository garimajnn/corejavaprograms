package designpatterns.behavioural.strategy;

public class BankTransfer implements PaymentService {
    public void pay(){
        System.out.println("payment is done though banktransafer");
    }
}
