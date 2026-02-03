package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ChainingHashMap<K,V> {
    private static class Entity<K,V>{
        K key;
        V value;
        public Entity(K key,V value){
            this.key=key;
            this.value=value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
    private static final int DEFAULT_SIZE=16;
     private  List<List<Entity<K,V>>>hashtable;



    public ChainingHashMap(){
      hashtable=new ArrayList<>(DEFAULT_SIZE);
        for(int i=0;i<DEFAULT_SIZE;i++){
            hashtable.add(new LinkedList());
        }

    }
    public ChainingHashMap(int size){
        hashtable=new ArrayList<>(size);
        for(int i=0;i<size;i++){
            hashtable.add(new LinkedList());
        }

    }


    public int hashCode(K key) {

        return key.hashCode();
    }
    public V add(K key,V value){
        int hashcode=Math.abs(hashCode());
        System.out.println("hashcode"+hashcode);
        int n=hashtable.size();
        int ind =  hashcode%n;
        System.out.println("ind"+ind);
        List<Entity<K,V>>entity=hashtable.get(ind);
        for(Entity<K,V> e:entity){
            if(e.getKey().equals(key)){
              V oldvalue= e.value;
              e.value=value;
              return oldvalue;
            }

        }
        entity.add(new Entity<>(key, value));
        return null;
    }

    public static void main(String[] args) {
        ChainingHashMap obj=new ChainingHashMap<>();
        obj.add(8,9);
    }

}
