package oopsdesignprinciples.kiss.dryvskiss;


// KISS AND DRY CONFLICTS
// dry hai
// kiss ni hai(complex,heavy condition)
public class DiscountCalculator {
    public double getDiscount(double amount,String type){
        if("festival".equalsIgnoreCase(type)){
            return amount*10;
        }
        else if( "online".equalsIgnoreCase(type)){
            return amount*30;
        }
        return amount;
    }

}

// KISS PRINCIPLE BOLTA HAI
//KISS (with some duplication)

class OnlineOrder{
    double getTotal(double amount){
        return amount*12;
    }
}
class ShopOrder{
    double getTotal(double amount){
        return amount*31;
    }
}
/**
 * If requirements are unclear -  kiss beats dry
 * If logic is stable - dry beats kiss
 * */

/**
 * Difference btw DRY ND KISS
 * Dry-
 * 1.aim to code reusability.
 * 2. comman mistakes -  lead to the premature optimisation.
 *
 * kiss -
 * 1. aim to keep things simple as possible
 * 2. comman mistakes - ignore reusability
 * */

/**
 * K“Premature optimization occurs when we optimize code before
 * understanding real requirements or performance bottlenecks.
 * It increases complexity and often leads to wrong
 * abstractions that are harder to change later.”
 * */


/**
 * Only 10 users
 * No performance issue
 * But we have implemented
 * Cache adds complexity, memory usage, invalidation logic
 *
 * */