package collection;
import java.util.*;

public class MyWeakHashMap  {
    public static void main(String[] args)  throws InterruptedException {

        WeakHashMap<String,Integer>map=new WeakHashMap<>();
        String two="two";
        map.put(two,2);
        two=null;
        System.gc();
        System.out.println("map"+map);
    }
}
