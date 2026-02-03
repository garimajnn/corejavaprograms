package streamspractise.handson.medium100ques;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("banana","banana","banana", "apple","apple", "cherry");
       List<Integer> numbers = List.of(5, 3, 1,1,2,4,7,1, 4, 2);
//        16. Remove Duplicate Elements from a List
        numbers.stream().distinct()
                .collect(Collectors.toList());

  //      19. Sort a List of Strings in Alphabetical Order

        List<String>ans=words.stream()
               .sorted((a,b)->{
                  return a.toLowerCase().compareTo(b.toLowerCase());
               }).toList();
        System.out.println("alphabetically sorted "+ans);

//        18. Sort a List of Integers in Descending Order
       List<Integer>sortedNumbers=numbers.stream()
                .sorted((a,b)->{
                    return b-a;
                }).toList();
        System.out.println("sortedNumbers "+sortedNumbers);

//        20. Sort a List of Strings by Their Length

        List<String>sortedWordLength  =words.stream()
        .sorted((a,b)->{

           if(a.length()==(b.length())){
               return a.compareTo(b);
           }
           return a.length()-b.length();
        }).toList();
        System.out.println("Sorted words by length "+sortedWordLength);

//        21. Find the Sum of Digits of a Number
        int num=123;
        int sum=String.valueOf(num).chars()
                .mapToObj(x->(char)x)
                        .collect(Collectors.summingInt(x->x-'0'));
        System.out.println("Sum of 123 "+sum);

//        or
       int sumOfDigit=String.valueOf(num)
               .chars() //Stream of asci value
               .map(x->x-'0') //IntStream
               .sum();
        System.out.println(sumOfDigit);

//        22. Find the Factorial of a Number
        int n=4;
      int factorial=IntStream.rangeClosed(1,n)
               .reduce(1,(x,y)->x*y);
        System.out.println(factorial);

     // 23. Find the Second-Largest Element in a List
      int secondLargest=numbers.stream()
                .sorted((a,b)->b-a)
                .distinct()
                .skip(1)
                .findFirst()
                .orElseThrow();
        System.out.println(secondLargest);

     // 25. Find the Longest String in a List
         String longestWord=words.stream()
               .max(Comparator.comparingInt(str->str.length()))
                  .orElse("");
        System.out.println("longest word "+longestWord);

//        27. Group a List of Strings by Their Length
      Map<Integer,List<String>>mp=words.stream()
                .collect(Collectors.groupingBy(str->str.length()
                        ));
        System.out.println(mp);

//29. Partition a List of Integers into Even and Odd Numbers
        Map<Boolean,List<Integer>>evenOdd=numbers.stream()
                .collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println(evenOdd);
       Map<String,List<Integer>>evenOddList=numbers.stream()
                .collect(Collectors.groupingBy(x->x % 2==0?"even":"odd"));
        System.out.println(evenOddList);
//        30. Merge Two Lists into a Single List
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(2, 3, 6);
        List<Integer>concatList=Stream.concat(list1.stream(),list2.stream())
                .toList();

//        31. Find the Intersection of Two Lists
        List<Integer>intersectionList=list1.stream()
                .filter(x->list2.contains(x))
                .toList();
        System.out.println("intersection "+intersectionList);

//        33. Find the Difference Between Two Lists
      List<Integer>merge1=list1.stream()
            .filter(x->!list2.contains(x))
              .toList();
      List<Integer>merge2=list2.stream()
              .filter(x->list1.contains(x))
              .toList();
      List<Integer>diffInList=Stream.concat(merge1.stream(),merge2.stream())
              .toList();
        System.out.println("Difference in two list  "+diffInList);

//        34. Count the Occurrences of Each Element in a List
       Map<String,Long>wordCount= words.stream()
                .collect(Collectors.groupingBy(str->str,Collectors.counting()));
        System.out.println(wordCount);

        // 35. Count the Occurrences of Each Character in a String

        String input="hello";
        Map<Character,Long>freqCountChars= input.chars().mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
        System.out.println(freqCountChars);

    // find frequnecy of each character in string
        input="my name is garima jain , i m from binhar";
        Map.Entry<Character,Long>maxfreqCount=input.chars()
                .mapToObj(ch->(char)ch)
                .filter(ch->ch==' ')
                .collect(Collectors.groupingBy(ch->ch,Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        // reverse string
       String string="hello";
        int l=string.length();
        String reverseString=IntStream.range(0,l)
                .mapToObj(i-> string.charAt(l-1-i))
                .map(ch->String.valueOf(ch))
                .collect(Collectors.joining(""));
        System.out.println("reverseString  "+reverseString);

//    37. Count the Occurrences of Each Vowel in a String

        String name="garima";
        Map<Character,Long>vowelCount=name.chars()
                .mapToObj(ch->(char)ch)
                .filter(ch->"aeiou".contains(String.valueOf(ch)))
                .collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
        System.out.println("vowelCount "+vowelCount);

//        38. Count the Occurrences of Each Digit in a String

        input="hello 123 world 456";
       Map<Character,Long>digitCount=input.chars()
                .mapToObj(ch->(char)ch)
                .filter(ch->Character.isDigit(ch))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(digitCount);

//      39.  reverse a list using stream

       List<Integer>reversedList=numbers.stream()
                .collect(
                Collectors.collectingAndThen(
                        Collectors.toList(),
                        list-> {
                            Collections.reverse(list);
                                    return list;
                        }
                ));
       // collect a list and then return its size
       int sizeofList= numbers.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        list->list.size()
                        ));
        System.out.println(sizeofList);

//        Collect a list of strings into a Set, then return whether the set is empty.

        List<String>strings=List.of("garima","pooja","raju","garima","raju");
       boolean isEmpty=strings.stream()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        set->set.isEmpty()
                        ));
        System.out.println(isEmpty);


        //Collect into a Set, then return it as an unmodifiable Set.
       Set<String>unmodifiableSet=strings.stream()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                      set->Collections.unmodifiableSet(set)));
        System.out.println(unmodifiableSet);

        // Collect into a List and then return the maximum element.
        Optional<Integer>maxiNum=numbers.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        list->list.stream().max(Comparator.naturalOrder())));
        System.out.println(maxiNum.get());
//        Collect into a List, then return a single comma-separated String.
      String collectedString= strings.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                       list->list.stream().collect(Collectors.joining(""))));

      // Convert names to uppercase, then return as unmodifiable list
     List<String>mappingList= words.stream().collect(
                Collectors.mapping(str->str.toUpperCase(),Collectors.toList())
        );
        System.out.println(mappingList);

        // Converting List → Set and also make it unmodifiable
        words.stream()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        set->Collections.unmodifiableSet(set)
                        ));


//        Converting List → Map , make map unmodifiable

        //
       Map<String,Integer>unmodifableMap=words.stream()
                .collect(
                        Collectors.collectingAndThen
                                (Collectors.toMap(
                                        str->str,
                                                str->str.length(),
                                                (oldv,newv)->oldv,
                                                LinkedHashMap::new),
                        map->Collections.unmodifiableMap(map)));
        System.out.println(unmodifableMap);
//        unmodifableMap.put("banana",32);
//        System.out.println(unmodifableMap);

        // 40 reverse a string using streams
        name.chars()
                .mapToObj(ch->(char)ch)
                .map(ch->String.valueOf(ch))
                .collect(Collectors.joining(""))
                ;

        // 41 find most frequent elements in a list
       Map.Entry<String,Long>mostFrequent=words.stream()
                .collect(Collectors.groupingBy(
                        s->s,
                        Collectors.counting()
                        ))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
        System.out.println(mostFrequent);

        // 42 least frequent element
        Map.Entry<String,Long>leastFrequent=words.stream()
                .collect(Collectors.groupingBy(s->s,Collectors.counting()))
                .entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .orElse(null);
        System.out.println(leastFrequent);

        // 43. Find the First Non-Repeated Character in a String .
     Character firstNonRepeating=name.chars()
                .mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(ch->ch,
                        LinkedHashMap::new,
                        Collectors.counting()
                        ))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()==1)
                .map(entry->entry.getKey())
                .findFirst()
              .orElse(' ');
        System.out.println("first non repeating "+ firstNonRepeating);

//        44. Find the First Repeated Character in a String

        Character firstRepeatedChar=name.chars()
                .mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(ch->ch,
                        LinkedHashMap::new,
                        Collectors.counting()
                        ))
                .entrySet().stream()
                .filter(entry->entry.getValue()>1)
                .map(entry->entry.getKey())
                .findFirst()
                .orElse(' ');
        System.out.println("First Repeated char "+firstRepeatedChar);

 // 45 check if a string is a palindrome
        String input2="noon";
        boolean isPallindrome=IntStream.range(0,input2.length()/2)
                      .allMatch(i->input2.charAt(i)==input2.charAt(input2.length()-1-i));
        System.out.println(isPallindrome);


        // 46. Find All Anagrams of a String from a List

        words = List.of("listen", "silent", "enlist", "google", "inlets");
        String target = "silent";

        List<String>anagrams=words.stream()
                .filter(word->Arrays.equals(
                    word.chars().sorted().toArray(),
                    target.chars().sorted().toArray()
                )).toList();
        System.out.println("List of Anagrams "+anagrams);

//        47. Generate the Fibonacci Sequence Using Streams

       List<Integer>fibSequence=Stream.iterate
               (new int[]{0,1},fib->new int[]{fib[1],fib[0]+fib[1]})
                .limit(10)
                .map(fib->fib[0])
                .toList();
        System.out.println(fibSequence);

//        48. Generate a List of Random Numbers Using Streams
Random random=new Random();
Stream.generate(()->random.nextInt(100))
        .limit(10)
        .forEach(System.out::println);

// ints
    List<Integer>randomInts = new Random()
                .ints(10,0,100)
                .boxed()
                .toList();

    // flatten a list
           List<List<Integer>> listOfLists = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9)
        );
        List<Integer>flattedList=
                listOfLists.stream() // Stream<List<Integer>
                        .flatMap(l1->l1.stream()) // here input is List<Integer>->Stream<Integer> from all the l then it will merge
                        .toList();
        System.out.println(flattedList);
        List<String>sentence=List.of("garima jain",
                "pooja mishra",
                "janhvi  jain");
       List<String>flattedStrinList=sentence.stream() // Stream<String>
                .flatMap(word->Arrays.stream(word.split(" "))) // yaha pr "garima jain" string input pr denge and output ["garima","jain"] and same with all word
                .toList();

//        50. Find the Sum of All Even Numbers in a Nested List
int sumOfEven=listOfLists.stream()
         .flatMap(l3->l3.stream())
         .filter(x->x%2==0)
         .mapToInt(x->(int)x).sum();  // IntStream
        System.out.println(sumOfEven);

        // reverse string
        String str="garima";
      String reverseStr=str.chars() // stream of ascii char
                .mapToObj(ch->(char)ch) // stream of character
              .map(ch->String.valueOf(ch))
                .collect(Collectors.collectingAndThen(Collectors.toList(),list-> {
                    Collections.reverse(list);
                    return String.join("", list);
                }));
        System.out.println("reverse Str "+ reverseStr);
    }
}
