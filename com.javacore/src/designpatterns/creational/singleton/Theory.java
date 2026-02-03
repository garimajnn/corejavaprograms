package designpatterns.creational.singleton;

public class Theory {
    /**
     * singleton yeh bolta hai ki mere class ka sirf ek hi instance bane and if any other time
     * I will try to create the instance it will return the already existing instance
     * And hum jab doosre baar object banayenge toh first wala hi return kr dege
     * */


/**
 *  jab hum Student s=new Student()
 *  se object banate hai sabse pahale constructor call hota
 *  agar main constructor ni banaunge toh default constructor call hoga jo initialise krega
 *  mere variables ko
 * */


/**
 * Steps that will happen jb main new keyword s object banaunge
 * new A();
 * 1. heap m object banega
 * 2. refrence stack m store hoga
 * So here culprit is new keyword jiski wajha se mere baar barr object bangea
 * So main aisa kuch kru ki mera constructor call hi na ho class k bahar.
 *
 * */

/**
 * Thread Safe nahi hai mera Singleton Class
 * If multiple threads try to access it,toh mere more than 1 object ban sakta hai
 * */


/**
 * Real Time Use Case (Advantage)
 * 1. logging system
 * 2. Database connection - expensive operation isme hum ni chahte ki multiple user aaye
 * and mere baar baar database connection kre so that time , i want do changes in my code
 * jiski wajhse se memory ki usage bht jyada ho jayege
 *
 *
 * 3. Configuration Manager -
 * Hamare application n bht sare configuration files hote hai jo saare application ko required hote
 * hai ..API_KEY
 * SO here i want ki ek hi object ko configuration files ko access krne k liye and saare
 * services usko user kre
 *
 *
 * */


/** Disadvantage (BottleNecks)
 *
 * 1.agar aisa koi class hai jaha multiple objects chahiye hi chahiye hai humko waha pr hum kabhi
 * bhi singleton use ni krenge
 * For eg amazon website sabhi users login kre toh differnt users banana
 *
 * */


/**
 * Humko dhyan rakhna chahiye kya pr singleton use krna kyuki isse bht jyada memory bachte hai hamare
 * but
 * we should also keep in mind kha pr use ni krna chahiye
 * kyuki isme humko thread safety k bhi dekhna padta hai
 * jiski wajha se test cases likhne m bhi thoda issue aata hai
 *
 * */
}
