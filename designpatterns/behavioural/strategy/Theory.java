package designpatterns.behavioural.strategy;

public class Theory {

/**
 * When there are family of  algorithm to solve a particular problem and
 * which one to choose is decided at run time .
 * Basically we encapsulate these different strategy in separate classes and
 * dynamically decides which one to choose . and also these algorithm
 * are interchangeable .
 *
 * */

/**
 * Real life use case -
 * 1. Different navigation routes
 * 2. Differnent recommendation algo
 * 3. Differnt driver matching strategies in uber and ola
 * 4. Different delivery pattern strategy for swiggy , zomota
 *
 * */

//Problem which will come without strategy design pattern

//public class PaymentFactory {
//
//    public PaymentService getPayment(String type) {
//
//        if(type.equals("creditCard")) {
//            return new CreditCardPaymentService();
//        }
//        else if(type.equals("upi")) {
//            return new UpiPaymentService();
//        }
//        else if(type.equals("netBanking")) {
//            return new NetBankingPaymentService();
//        }
//
//        throw new RuntimeException("Invalid payment type");
//    }
//}


//2Violates Open/Closed Principle ❌
//        3️ Tight Coupling ❌
//    4️ No Dependency Injection ❌
//    Hard to Test ❌


//If we implement Factory Pattern using if-else and manual object creation,
//    it leads to tight coupling, violation of Open/Closed Principle,
//    and poor scalability. Every new type requires modifying the factory class.
//    Strategy Pattern combined with Spring Dependency Injection solves this by
//    injecting all implementations and selecting them dynamically
//    without modifying existing code.

}



