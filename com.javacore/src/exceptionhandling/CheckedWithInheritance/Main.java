package exceptionhandling.CheckedWithInheritance;

import org.w3c.dom.ls.LSOutput;

public class Main extends Object {
    public static void main(String[] args) {
        try{
            Parent p=new Child();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
