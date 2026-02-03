package exceptionhandling.CheckedWithInheritance;

import java.io.FileNotFoundException;

public class Parent {
    public void show() throws FileNotFoundException{
        throw new FileNotFoundException("file not found");
    }
}
