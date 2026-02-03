package designpatterns.creational.singleton;

public class EagerInitialisation {

    // Eager Initialisation
    // Jab class load hogi then instance ban jayega
    private static EagerInitialisation instance=new EagerInitialisation();
    public static EagerInitialisation getInstance(){
        return instance;
    }

    // yeh static initalisation hai jb mere class load hogi toh mera instance initialisa ho jayega
    // class load hote hi mera pass object aa jayega
    // lekin client ko poore project m zaroorat hi ni pade uss object ki
    // so this is not good way implementing singleton principle
}
