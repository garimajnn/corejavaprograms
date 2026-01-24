package solidprinciples.liskovsubstitution.importantDiscussion;

public class Theory {

/**
 * Terminologies
 * broad -> parent class
 * narrow -> child class
 * */



/**
 * Zaroori nahi har wo child class jo parent ko override
 * and parent k sabhi method ko override kre wo liskov principle ko bhi follow kre
 * kre Liskov Principle ko follow kre
 *
 *
 *
 * Jaise humne dekha tha problem of liskov mein ki isne
 * child class ko overide kra tha but error return krdia tha
 * Therefore child class should also behave like parent class
 * usko response bhi waise hi krna padega
 * */


/**
 * So there are some guidelines jo follow krne chahiye
 *
 * 1. Signature Rule:jab child override kre toh argument same hona chahiye else overloading hoga na ki overriding
 * 2. Property Rule - History Rule,Class Invariant
 *
 * class Parent{
 *     void show(Integer a){};
 * }
 * class Child extends Parent{
 *     void show(Integer a){}   // valid override
 *     void show(String a){} // no valid override  (overloading)
 * }
 *
 * */

public static void main(String[] args) {
    Parent parentObj=new Child();
    parentObj.show(2);
}
}
// 1 . signature rule
// 1.1 argument rule
class Parent{
    void show(int s){
        System.out.println("parent "+s);
    }
}
class Child extends Parent {
    void show(Number x) {
        System.out.println("child " + x);
    }
}

// 1.2. return type (covariant) : return type of child class can be make same or narrow
  // let say return type Animal a=(yaha pr parent(animal) ka object aa sakta ya phir child(dog) ka bhi object aa sakta)
  // but yaha problem jb aate jab hamara return type more broader ho jat
class Organims{
    void display(){
        System.out.println("display");
    }
}


class Animal extends Organims{
    public Animal random() {
        return (new Animal());
    }
}
class Dog extends Animal{
    public Dog random(){
        return (new Dog());
    }
}

// 1.3 exception
// agar mere parent class exception throw kr rhe hai toh child class ya toh same ya phir
// narrow exception throw kr sakte usse broad exception throw ni kr krte
// kyu kyui child k pass hamare try catch block hota
// client se ready to except the runtime exception object but usko exception k object dunge toh error throw krdega
//  ALWAYS REMEMBER KI CLIENT KO SIRF CONTRACT K BARE M PATA HAI USKO SIRF MAIN INTERFACE PATA HAI KI
//  AISA AISA HONA HAI USKO BAKI KUCH NI PTA HOTA CHILD KAISE BEHAVE KR RHA AND ALL





/**  PROPERTY RULE
 * The property rule (sometimes called the invariants rule) states that subclasses should preserve the properties and invariants of the parent class. In other words:

 * The subclass should not violate any invariants (conditions that must always be true) established by the parent class.

 * It consists of 2 things
 * ---> Class Invariant
 * ---> History Constraint
 * */


/**
 *
 * Property Rule :-
 * --------------------------- CLASS INVARIANT -----------
 * Invaraint matlab rule ya koi bhi aisa rule jo kisi bhi class k liye follow krega
 * Mere pass let's say child class hai jo ya toh parent  class ko replicate kre
 * ya phir usko strengthen kre usko weak nahi kre
 *
 *
 * Example -
 * Lets say parent class Account hai uske pass balance variable hai jo bolta hai ki balance >0
 * Lets say mere pass CheatAccount hai, wo balance ko negative kr deta hai
 *
 *

 * class Account{
 *     balance;
 *     Account(int balance){
 *         balance=balance;
 *     }
 *     void withdraw(int amt){
 *         if(amt>balance){
 *             throw new IllegalArgumentException();
 *         }
 *         balance-=amt;
 *     }
 * }
 * class CheatingAccount extends Account{
 *     CheatingAccount(){
 *         super(200);
 *     }
 *     void withdraw(int amt){
 *         balance-=amt;   // HERE IT BREAKS MY LISKOV PRINCIPLE KYUKI PARENT HAMESA ERROR
 *                         // THROW KREGA IF BALANCE IS LESS THAN 0 BUT YAHA PR WO BALANCE LESS
 *                         // KR RHA
 *     }
 * }
 *
 *
 * */




/** ------------------ HISTORY CONSTRAINT
 * EK BAAR PARENT CLASS N JO BOL DIA KI YEH STATE HAI TOH CHANGE NI HONA CHAHIYE
 * */

// History Constraint bolta hai ki child should have both these methods
class AccountParent{
    private double balance;
    AccountParent(double amount){
        balance=amount;
    }
//    HISTORY CONSTRAINT - WITHDRAWAL SHOULD ALSWAYS BE ALLOWED
    void withdraw(double amt){
        balance-=amt;
        System.out.println("Withdraw balance");
    }
}

class AccountChild{

// LSP BREAK ! HISTORY CONSTRAINT BREAK
// PARENT CLASS BEHAVIOR CHANGE  - WITHDRAWAL THROWS ERROR
// THIS CLASS WILL BREAK CLIENT CODE AND RELIES ON WITHDRAWAL

void withdraw(double amt){
    throw new IllegalArgumentException("Not possible to withdraw ");
}

}


// IMP POINTS ABOUT THE LSP
// AGAR MERE PARENT CLASS NE KUCH KUCH BEHAVIOR KO IMMUTABLE BOLA HAI
// AND CHILD CLASS USKO MUTABLE BANA RHI THEN TOO ITS BREAKAGE OF LSP PRINCIPLE
// ITS ONE OF THE HISTORY CONSTRAINT BREAKING RULE






/** ----------------------------- METHOD RULE -------------------------------------------
 * It consist of two rules
 * --> pre condition rule
 * ---> post condition rule

 * */


// Pre Condition Rule
// Kisi method ke run hone k pahele koi condition lagai hai koi bhi
// ya toh comment krke ya kaise bhi
// then it will become child class responsibility ki wo usko as it is follow kre
// ya weak kre but strengthen ni kre usko

// weak example
class ParentNum{
   // here num should be between 0 to 5
    void input(int num){
         if(num>0 && num<5){
             System.out.println("okay");
         }
         else{
             throw new RuntimeException();
         }
    }
}
class ChildNum extends ParentNum{
    // valid - num should be between 0 to 5
    // valid - num should be between 0 to 10
    // invalid - nums should be btw 0 to 3
    void input(int num){
    }
}

class User{
    void createPassword(String password){
        // password length atlest 8 chars ki hona chahiye
        if(password.length()<8){
            throw new IllegalArgumentException("Password lemgth must be 8 char long");
        }
        System.out.println("password length must be 8 chars long");
    }
}
class AdminUser{
    // weak pre condition
    // password length atleast 6 chars ki hona chahiye
    void createPassword(String password){
           if(password.length()<6){
               throw new RuntimeException("password length ");
           }
    }
}




// post condition
class Car{
    public int speed;
    Car(){
        speed=10;
    }
    public void applyBreak(){
        System.out.println("break applied and speed kam hona chahiye");
        speed-=20;
    }
}
class ElectricCar extends Car{
    int charge;
    public ElectricCar(){
        charge=10;
    }
    // LSP post method functionallity
    // speed  must decrease (main condition fulfils hona chahiye)
    // charging increase
    public void applyBreak(){
        System.out.println("break applied spped kam");
        speed-=20;
        charge+=10;
    }
}

