package designpatterns.creational.singleton.breakpattern.reflectionapi;

public class Singleton {
    private static  Singleton instance;
    private Singleton(){
        // solution to breakage of reflection api
        if(instance!=null){
            throw new RuntimeException("You're trying to break the singleton principle");
        }

    }

    public static Singleton getInstance() {
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
