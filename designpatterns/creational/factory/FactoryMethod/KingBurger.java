package designpatterns.creational.factory.FactoryMethod;

public class KingBurger implements FactoryMethod{
    public Burger createBurger(String typeOfBurger){
        if(typeOfBurger.equalsIgnoreCase("basic")){
            return new SimpleWheatBurger();
        }
        else if(typeOfBurger.equalsIgnoreCase("standard")){
            return new StandardWheatBurger();
        }
        else if(typeOfBurger.equalsIgnoreCase("premium")){
            return new PremiumWheatBurger();
        }
        else{
            throw new IllegalArgumentException("No other burger avail");
        }
    }
}
