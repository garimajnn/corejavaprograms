package designpatterns.creational.factory;

public class FactoryClass {
    public  Payment  getPayment(String modeOfPayment){
        if(modeOfPayment.equalsIgnoreCase("credit card")){
            return new CreditCard();
        }
        else if(modeOfPayment.equalsIgnoreCase("cash")){
            return new Cash();
        }
        else if(modeOfPayment.equalsIgnoreCase("gpay")){
            return new Gpay();
        }
        else{
            return null;

        }
    }
}

