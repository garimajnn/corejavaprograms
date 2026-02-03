package designpatterns.creational.singleton.breakpattern.deserialization;

import java.io.Serializable;


 // here solution is implement the readResolve()

public class Singleton  implements Serializable {
    private static Singleton instance;
    private Singleton(){

    }

    public static Singleton getInstance() {
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
    public Object  readResolve(){
         return instance;
    }
}
