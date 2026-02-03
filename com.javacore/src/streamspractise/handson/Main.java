package streamspractise.handson;

import java.util.Comparator;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // find the nearest number in a list
        List<Integer> list=List.of(1,2,3,4);
        int target=5;
        int ans=list.stream()
                .min(Comparator.comparingInt(num->Math.abs(num-target)))
                .orElseThrow(()->  new IllegalArgumentException());
        System.out.println(ans);

        // map se data process kro
        Map<String,Integer>map=new HashMap<>();
        map.put("apple",21);
        map.put("ber",43);
        map.put("banana",5);
        int totaldata=map.entrySet().stream()
                .collect(Collectors.summingInt(entry->entry.getValue()));
        System.out.println(totaldata);

        // To Map
       Map<Integer,Integer>m=list.stream()
                .collect(Collectors.toMap(
                        x->x,
                        x->x*4,
                        (oldv,newv)->oldv,
                        TreeMap::new
                ));
        System.out.println(m);

       // counting the word occurence
        String sentence="my name is garima";
    Optional<Map.Entry<String,Integer>>result=Arrays.stream(sentence.split("\\s+"))
                .collect(Collectors.toMap(str->str,
                        str->str.length()
                )).entrySet()
                .stream()
                .max(Comparator.comparingInt(entry->entry.getValue()));
        System.out.println(result.get().getKey());

        // last occurence of a character
        String name="hello";
        Integer lastOccurence=
                name.chars()
                .mapToObj(ch->(char)ch)
                .collect(Collectors.toMap
                                (
                                        ch->ch,ch->name.indexOf(ch),
                                        (oldv,newv)->newv,
                        LinkedHashMap::new
                ))
                .entrySet()
                .stream()
                .filter(entry->entry.getKey()=='l')
                .map(entry->entry.getValue())
                .findFirst().orElse(-1);
        System.out.println(lastOccurence);

    }
}
