package oopsdesignprinciples.dryprinciples.discount;

public class StoreDiscountCalculator {

    public static double applyDiscount(double amount){
        return amount*10.21;
    }
    public static double onlineStoreDiscount(double amount){
        return StoreDiscountCalculator.applyDiscount(amount);
    }
    public static double storeDiscount(double amount){
        return StoreDiscountCalculator.applyDiscount(amount);
    }
    public static double festivalStoreDiscount(double amount){
        return StoreDiscountCalculator.applyDiscount(amount);
    }

}
/**
 * Here I prematurely applied discount the without even thinking about possible scenario
 * isliye sometime it make wrong abstraction
 *
 *
 * Requirement changes code OCP breaks
 * Online orders → 10% discount
 * Store orders → 5% discount
 * Festival sale → 20% discount
 * 💥 Problem: the abstraction assumed one discount rule fits all.
 * */
