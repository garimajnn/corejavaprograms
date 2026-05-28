package designpatterns.creational.singleton.breakpattern.deserialization;

import java.io.*;

public class Deserialization {


    public static void main(String[] args) throws IOException ,ClassNotFoundException{
        Singleton obj=Singleton.getInstance();
        System.out.println(obj.hashCode());

         ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.txt"));
         oos.writeObject(obj);
         System.out.println("serialistion done");
         ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.txt"));
         Singleton s2=(Singleton) ois.readObject();
         System.out.println(s2.hashCode());
    }
}
