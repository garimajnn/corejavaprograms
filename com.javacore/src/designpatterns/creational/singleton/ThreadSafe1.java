package designpatterns.creational.singleton;

public class ThreadSafe1 {
    private static ThreadSafe1 instance;
    private ThreadSafe1(){

    }
    // thread safe -
    // maine yaha pr synchronised use kra jiski wajha se sirf ek hi
    // thread us method ko access kr payega
    // lekin yeh acha way ni hai
    // humko sirf ek hi line ko thread safe krna hai
    // agr uske upr neeche bht saara code hai toh wo access kr paaye hum easily
    // NOT GOOD WAY
    public synchronized ThreadSafe1 getInstance(){
        if(instance==null){
            instance=new ThreadSafe1();
        }
        return instance;
    }
}
