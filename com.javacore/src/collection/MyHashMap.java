package collection;

// load factor 0.75
// default size = 16


public class MyHashMap<K,V> {
    private static  class Entity<K,V>{
        private K key;
        private V value;
        Entity(K key,V value){
            this.key=key;
            this.value=value;
        }
        public  K getKey(){
            return this.key;
        }
        public V getValue(){
            return this.value;
        }
    }
    private static int DEFAULT_SIZE=16;
    Entity<K,V>[] elements;
    public MyHashMap(){
       elements=new Entity[DEFAULT_SIZE];
    }

    public int hashCode(K key){
        return Math.abs(key.hashCode());
    }
    public V add(K key,V value){
        int  hashcode=hashCode(key);
         int ind=hashcode% elements.length;

         // linear probing
        for(int i=0;i<elements.length;i++){
          if ( elements[(i+ind)%elements.length]==null){
                elements[i+ind%16]=new Entity<>(key,value);
                return null;
            }
            if ( elements[(i+ind)%elements.length]!=null && elements[(i+ind)%elements.length].key.equals(key) ){
                int n =elements.length;
                V oldVal=elements[(i+ind)%n].getValue();
                elements[(i+ind)%n].value=value;
                return oldVal;
            }
        }
       throw new RuntimeException("hashmap is full");
    }

    public static void main(String[] args) {
        MyHashMap<Integer,Integer>mp=new MyHashMap();
        mp.add(8,9);

    }
}
