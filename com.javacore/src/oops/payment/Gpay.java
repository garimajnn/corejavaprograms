package oops.payment;


// Gpay implement the Payment
public class Gpay implements Payment {
    public void pay(double amount){
        System.out.println("payment done via gpay" +amount);
    }
}
