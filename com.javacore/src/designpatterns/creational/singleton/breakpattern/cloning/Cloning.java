package designpatterns.creational.singleton.breakpattern.cloning;

public class Cloning {
    public static void main(String[] args) {
        Singleton obj=Singleton.getInstance();
        System.out.println(obj.hashCode());
        Singleton obj2=(Singleton) obj.clone();
        System.out.println(obj2.hashCode());
    }
}
