package designpatterns.behavioural.strategy;

public class PaymentFactory {

    public static PaymentService getPaymentStrategy(String paymentService){
        if(paymentService.equalsIgnoreCase("gpay")){
            return new Gpay();
        }
        else if(paymentService.equalsIgnoreCase("banktransfer")){
            return new BankTransfer();
        }
        else if(paymentService.equalsIgnoreCase("creditcard")){
            return new BankTransfer();
        }
        else if(paymentService.equalsIgnoreCase("paypal")){
            return new PayPal();
        }
        else{
            throw new IllegalArgumentException("Unknown Payment type");
        }
    }


}
