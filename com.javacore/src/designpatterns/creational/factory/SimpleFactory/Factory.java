package designpatterns.creational.factory.SimpleFactory;

public class Factory {
    public static Burger createBurger(String typeOfBurger){
        if(typeOfBurger.equalsIgnoreCase("basic")){
            return new SimpleBurger();
        }
       else  if(typeOfBurger.equalsIgnoreCase("premium")){
            return new PremiumBurger();
        }

       else if(typeOfBurger.equalsIgnoreCase("standard")){
            return new StandardBurger();
        }
       else{
            throw new IllegalArgumentException("No other burger are avail");
        }

    }
}
