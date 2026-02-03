package solidprinciples.dependencyinversion.payment.voilate;

public class Gpay implements Payment{
    public Gpay(){

    }
    @Override
    public void pay() {
        System.out.println("paayment is done via gpay");
    }
}
