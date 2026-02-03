package collection;
import java.util.*;

public class MyTreeMap {
    public static void main(String[] args) {

        Map<Integer,Integer>map=new TreeMap<>((a,b)->{
           if(a==null && b==null){
               return 0;
           }
           if(a==null){
               return 1;
           }
           if(b==null){
               return  -1;
           }


            return a-b;
        });
        map.put(2,2);
        map.put(7,7);
        map.put(1,1);
        map.put(null,40);
        for(Map.Entry<Integer,Integer>a:map.entrySet()){
            System.out.println(a.getValue());
        }
    }

}
