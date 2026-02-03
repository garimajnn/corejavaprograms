package solidprinciples.dependencyinversion.payment.voilate;


public class Main {
    public static void main(String[] args) {
        PaymentService paymentService=new PaymentService();
        paymentService.dopayment();
        }

}
