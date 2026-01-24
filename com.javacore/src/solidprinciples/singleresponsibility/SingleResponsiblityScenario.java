package solidprinciples.singleresponsibility;

public class SingleResponsiblityScenario {

    /**  As the name suggests, this principle states that each class should have one responsibility,
 *      one single purpose. This means that a class will do only one job,
       which leads us to conclude it should have only one reason to change
     */


/**
 * let's say mere pass product class h -> name,price
 * lets say shoppingCart -> calculateTotalPrice() , printInvoice(),saveToDB()
 * Agar main kl change krunge mere code ko for logic of saveToDB jiski wajha se
 * COMPOSITION USE HOTA HAI TO SOLVE THE PROBLEM
 * Now I will make shoppingCart -> calculateTotalPrice()
 *  And create other two class cartInvoicePointer  -> printInvoice(),
 *  cartDBStorage->saveToDB()
 *
 *
 * */


}
