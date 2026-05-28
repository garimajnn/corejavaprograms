package designpatterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        FactoryClass factoryClass=new FactoryClass();
        Payment paymentMode=factoryClass.getPayment("cash");
        paymentMode.pay(9000);
    }
}
