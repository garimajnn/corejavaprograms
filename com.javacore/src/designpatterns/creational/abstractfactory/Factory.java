package designpatterns.creational.abstractfactory;

public class Factory {
    public static MealComboFactory getCombo(String combotype){
        if(combotype.equalsIgnoreCase("nonveg")){
            return new NonVegCombo();
        }
        else if(combotype.equalsIgnoreCase("veg")){
            return new VegCombo();
        }
        else{
            throw new IllegalArgumentException("No other combos are avail ");
        }
    }
}
