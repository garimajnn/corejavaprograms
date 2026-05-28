Factory Design Pattern (Core Concept)

Problem it solves:
"We should not expose object creation logic to the client."

Instead of new keyword everywhere, we delegate object creation to a factory.

Example WITHOUT Factory Pattern (Bad Design)

Imagine a payment system:

class PaymentService {
public void pay(String type) {
if (type.equals("UPI")) {
System.out.println("Paying via UPI");
} else if (type.equals("CARD")) {
System.out.println("Paying via Card");
} else if (type.equals("CASH")) {
System.out.println("Paying via Cash");
}
}
}
Usage:
PaymentService service = new PaymentService();
service.pay("UPI");

❌ Problems in this approach
1. Violates Open/Closed Principle

If new payment type comes (Wallet, Crypto), you modify existing class.

2. Tight coupling

Logic is tightly bound inside PaymentService.

3. Hard to test

Cannot independently test payment types.

4. Code becomes messy (God class problem)


5. Solution: Factory Design Pattern
   Step 1: Create interface
   interface Payment {
   void pay();
   }
   class UpiPayment implements Payment {
   public void pay() {
   System.out.println("Paying via UPI");
   }
   }

class CardPayment implements Payment {
public void pay() {
System.out.println("Paying via Card");
}
}

class PaymentFactory {

    public static Payment getPayment(String type) {
        if (type.equals("UPI")) {
            return new UpiPayment();
        } else if (type.equals("CARD")) {
            return new CardPayment();
        }
        throw new IllegalArgumentException("Invalid payment type");
    }
}

Step 4: Client code
public class Main {
public static void main(String[] args) {
Payment payment = PaymentFactory.getPayment("UPI");
payment.pay();
}
}
Factory Pattern is used to encapsulate object creation logic and provide 
loose coupling between client and implementation. 
It helps in following Open/Closed Principle and makes system extensible.

# SpringBoot Factory
ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
When you do:
MyService service = context.getBean(MyService.class);
👉 Spring is acting as a Factory
It:
creates object
manages lifecycle
injects dependencies


Factory Pattern is used to create object of one type.
Abstract Factory Pattern is used to create the multiple related object


# Abstract Factory

Abstract Factory is a creational design pattern that provides an interface 
to create a family of related objects without specifying their concrete classes.
The key idea is that it creates multiple related 
objects together which are meant to work as a consistent system.”

“In Spring Boot, this concept is implemented through Auto-Configuration, 
where the framework automatically creates and configures a family of related 
beans based on the classpath and application properties.”


🟢 3. Real Example (Very Important)
👉 Let’s take database setup in Spring Boot
When we add configuration:
spring.datasource.url=jdbc:mysql://localhost:3306/db
spring.datasource.username=root
spring.datasource.password=123

👉 Spring Boot does NOT create just one object.

Instead, it creates a family of related beans, such as:
DataSource
EntityManagerFactory
EntityManager
PlatformTransactionManager
In Spring Boot, AutoConfiguration behaves like an Abstract Factory
pattern. Based on configuration properties and classpath dependencies, 
Spring creates a family of related beans such as DataSource, EntityManagerFactory,
and PlatformTransactionManager. Although Spring does not explicitly
implement the Abstract Factory interface, its internal mechanism achieves
the same goal of creating related objects without exposing their concrete classes.

    

