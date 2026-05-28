package designpatterns.creational.singleton;

// private Constructor
// static getInstance () so that every time it return same instance

public class LazySingleton {
   private  static LazySingleton instance;
   private LazySingleton(){

   }

   // Lazy Initialisation - object will be created only when needed
   static public LazySingleton getInstance(){
       if(instance==null){
           instance=new LazySingleton();
       }
       return instance;
   }


   // isme problem yeh hai ki jb hum getInstance() ko call krenge tb hi instance banega
    // but yaha pr humne thread k dhyan ni rakha hai
}
