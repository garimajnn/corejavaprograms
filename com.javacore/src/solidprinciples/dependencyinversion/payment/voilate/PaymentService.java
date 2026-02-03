package solidprinciples.dependencyinversion.payment.voilate;

// voilates the DIP
// code should be dependent on abstract class or interface
// so that it is not tightly coupled
public class PaymentService {

    public PaymentService(){

    }
    Payment payment=new Gpay();

     void dopayment(){
        payment.pay();
    }
}
