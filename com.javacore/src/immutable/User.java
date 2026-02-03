package immutable;

// class must be final
// data members must be private,final
//  parameterised constructor should initialise all fields performing deep copy
// deep copy of objects should perform in getter methods
// no setters

import java.util.HashMap;
import java.util.Map;

public final class User{
    private final String name;
    private final int id;
    private final Map<String,Integer>metadata;

    public String getName() {
        return name;
    }

    public Map<String, Integer> getTemp() {

        Map<String,Integer>temp=new HashMap<>();
        for(Map.Entry<String,Integer>mp:metadata.entrySet()){
            temp.put(mp.getKey(), mp.getValue());
        }
       return temp;
    }

    public int getId() {
        return id;
    }

    public User(int id, String name, Map<String,Integer>metadata){
        this.id=id;
        this.name=name;
        Map<String, Integer> temp = getStringIntegerMap(metadata);
        this.metadata=temp;
    }

    private static Map<String, Integer> getStringIntegerMap(Map<String, Integer> metadata) {
        Map<String,Integer>temp=new HashMap<>();
        for(Map.Entry<String,Integer>mp: metadata.entrySet()){
            temp.put(mp.getKey(), mp.getValue());
        }
        return temp;
    }

}



