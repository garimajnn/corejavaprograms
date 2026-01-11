package streamspractise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Easy2Questions {
    public static void main(String[] args) {

        List<String> strs=List.of("garima","pooja","gayan","ginni");

        // find string which has vowels
        ;

//        remove duplicates from a list
        List<Integer> list= Arrays.asList(81,52,13,42,55,55,42,1,81);


        list.stream().distinct().forEach(System.out::println);

//      find average of all numbers in a list
        List<Integer> list1= Arrays.asList(81,52,13,42,55,55,42,1,81);
        double avg= list1.stream().
         filter(Objects::nonNull)
        .mapToInt(Integer::valueOf)
                .average()
                .orElse(0.0);
        System.out.println("Avg of a stream "+avg);

//   sort the list of integers in asc or desc using streams
        List<Integer>sortedlist=list.stream()
                .mapToInt(x->(int)x)
                        .sorted().boxed().toList();
//                .sorted(Comparator.naturalOrder())
//                .toList();
        System.out.println(sortedlist);
        List<Integer>reversedSorted=list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        // or
        List<Integer>sortedreverse=list1.stream().sorted((a,b)->b-a).toList();
        System.out.println(reversedSorted);


//   count how many strings starts with  a specific chars

        long strsStartc=strs.stream().filter(x->x.startsWith("g")).count();
        System.out.println(strsStartc);

// join all strings in a list into a single comma-separated strings
        String concatStr=   strs.stream()
                .collect(Collectors.joining(",","[","]"));
        System.out.println(concatStr);

// check if elements are positive numbs or not
        boolean postive= list.stream()
                .allMatch(x->x>0);
        System.out.println("Positiv "+postive);


        // check if any numb is divisible by 3

        boolean divby3=list.stream()
                .anyMatch(x->x%3==0);
        System.out.println("divide by 3" +divby3);

// convert list of list into single list
        List<List<Integer>>listOfList= Arrays.asList(
                Arrays.asList(1,2,4),
                Arrays.asList(7,9,3,14),
                Arrays.asList(6,2,6,2)
        ) ;
        List<Integer>flatlist=listOfList.stream().flatMap(x->x.stream())
                .toList();

        System.out.println(flatlist);

// find the first non-empty string in a list
        Optional<String> result= Stream.of("",null,"garima","","pooja")
                .filter(x-> x!=null &&  !(x.isEmpty()))
                .findFirst();
        System.out.println(result.get());

//         find the second largest number on a list using streams

        Optional<Integer>secondLargest=Stream.of(9)
//                list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)

                .findFirst();
        System.out.println(" second largst "+secondLargest.orElse(-1));




    }

}
