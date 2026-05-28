package designpatterns.creational.factory.AbstractFactory.Product2;

public class WheatGarlicBread implements GarlicBread{
    @Override
    public void prepareBread() {
        System.out.println("Wheat garlic bread is ready");
    }
}
