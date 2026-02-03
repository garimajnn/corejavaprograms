package practiseTask;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fruits {
    public static void main(String[] args) {
        List<String>fruits= List.of("Apple","Banana","Mango","Guava","Apple","Banana");
    // find duplicate count
       long duplicateCount=fruits.stream()
                .collect
                        (Collectors.groupingBy(fruit->fruit,Collectors.counting()))
                .entrySet().stream()
                .filter(entry->entry.getValue()>1)
                .count();
        System.out.println(duplicateCount);

        // find unique fruits
        fruits.stream()
                .distinct()
                .forEach(System.out::println);

        // find length of each unique fruit name
       Map<String,Integer> fruitLengthCount=fruits.stream()

                .collect(Collectors.toMap(fruit->fruit,fruit->fruit.length(),(oldv,newv)->oldv, LinkedHashMap::new));
        System.out.println(fruitLengthCount);

        // convert all to upper case
        fruits.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
