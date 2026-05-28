package designpatterns.creational.factory.FactoryMethod;

public class SinghBurger implements FactoryMethod{
    @Override
    public   Burger createBurger(String typeOfBurger) {
        if(typeOfBurger.equalsIgnoreCase("basic")){
            return new SimpleBurger();
        }
        else if(typeOfBurger.equalsIgnoreCase("standard")){
            return new StandardBurger();
        }
        else if(typeOfBurger.equalsIgnoreCase("premium")){
            return new PremiumBurger();
        }
        else{
            throw new IllegalArgumentException("No other burger avail");
        }

    }
}
