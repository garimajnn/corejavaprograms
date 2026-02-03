package exceptionhandling.CheckedWithInheritance;

import java.io.FileNotFoundException;

public class Child  extends Parent{
    public void show() throws FileNotFoundException {

        System.out.println("child k method ");
    }

}
