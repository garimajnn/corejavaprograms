package oops;
import oops.payment.*;
public class ShoppingWebsite {

    // pay to make a payment
    // there are different way of doing the payment  depending on the object i have created i will do payment


    public static void main(String[] args) {
        ShoppingFacade shoppingFacade=new ShoppingFacade();
        Payment payment = new Gpay();
        payment.pay(321);
    }
}
