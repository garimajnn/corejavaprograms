package designpatterns.creational.factory;

public class Theory {

/**
 * When there is a superclass and multiple subclasses,and we want object of subclasses based on
 * input and requirement
 * Then we create a factory class which takes responsibility of creating the object based on the
 * class based on input.
 *
 * 99% times projects m use hote hai
 * Advantage -
 * -> focuses on creating the object for interface rather than implementation
 * ->Loose coupling,more robust code
 *
 * Provides a mechanism to create objects without exposing the creation logic.
 * Useful for decoupling object construction from the client.
 *
 * Base of parameters hamare objects create ho rhe hai..
 * Humne clients se chupa lia hai internal implementation
 *
 * */


/**
 * Real time usecases-
 * 1. resturant menu  select krna  dining,breakfast,lunch
 * 2.when creating order in swiggy order can be of type takeout,dine in,delivery (take decision at runtime)
 * here we can encapulate the creation of factory design pattern
 * 3.resturant creation can be of cafe,dining,fast food chain
 * 4.creation of rides in uber, ola-> solo ride,shared ride,luxry ride
 * Here we encapsulte the creaation of factory class
 *
 *
 * */



/**
 * Simple Factory: One product, static method.
 * Factory Method: Abstraction on factory side, easy to add new factories.
 * Abstract Factory: Multiple products, factory creates families of products.
 * */

}
