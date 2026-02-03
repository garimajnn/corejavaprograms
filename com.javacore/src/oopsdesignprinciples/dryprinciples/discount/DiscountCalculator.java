package oopsdesignprinciples.dryprinciples.discount;


// Step 1 : To solve the earlier code problem
public class DiscountCalculator {
    static double applyDiscount(double amount,String orderType){
        if(orderType.equalsIgnoreCase("store")){
            return amount*21;
        }
        else if(orderType.equalsIgnoreCase("online")){
            return amount*10;
        }
        else if(orderType.equalsIgnoreCase("festival")){
            return amount*30;
        }
        return amount;
    }
}

// BEST PRACTISE -
// 1. ALLOW DUPLICATION FIRST
// 2. THEN REFACTOR THE CODE AFTER UNDERSTANDING THE PATTERN






