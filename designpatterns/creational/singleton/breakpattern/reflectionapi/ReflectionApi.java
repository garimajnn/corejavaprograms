package designpatterns.creational.singleton.breakpattern.reflectionapi;

import java.lang.reflect.Constructor;

public class ReflectionApi {

    /** Ways to break singleton pattern
     *
     * 1. Reflection Api -
     * solution1 - throw exception if instance is already there inside constructor
     * solution2 - use enum
     * */
    public static void main(String[] args) {
        try {
            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            Singleton obj = constructor.newInstance();
            System.out.println(obj);
        }
        catch (Exception e) {
            System.out.println("error"+e.getMessage());
        }
    }
}
