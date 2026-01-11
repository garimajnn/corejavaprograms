package streamspractise;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.*;

import static java.util.Arrays.*;
import static java.util.Arrays.stream;

public class Practise {

    public static void main(String[] args) {



        List<Integer> list = asList(1, 2, 3,1,1,3,9,8,3, 4, 5, 6, null, 7, 7, 8);
        List<String>strs= asList("1garima","mahina","4try","catch",null,"");
        String str="garima";
//    Separate odd and even numbers in a list of integers

       List<List<Integer>>oddEvenList=list.stream().filter(Objects::nonNull)
                .collect(Collectors.groupingBy(x->x%2, Collectors.toList()))
               .entrySet().stream()
               .map(entity->entity.getValue())
               .toList();
               ;
        System.out.println(oddEvenList);

//    Given a list of integers, write a Java 8 program to separate the odd and even numbers into two separate lists.

        Map<Boolean, List<Integer>> evenOddList = list.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println("Even" + evenOddList.get(true));
        System.out.println("Odd" + evenOddList.get(false));


//    Remove duplicate elements from a list using Java 8 streams
        list.stream()
                .filter(Objects::nonNull)
                .distinct()
                .forEach(System.out::println);
//    Write a Java 8 program to remove duplicate elements from a list using the stream API and lambda expressions.


//    Find the frequency of each character in a string using Java 8 streams
        Map<Character,Long>frequenyCount=str.chars()
                .mapToObj(x->(char)x)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(frequenyCount);
        //    Write a Java 8 program to find the frequency of each character in a given string using the stream API and collectors.



//    Find the frequency of each element in an array or a list

       Map<Integer,Long>freqCount=list.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(freqCount);
//    Write a Java 8 program to find the frequency of each element in an array or a list using streams and collectors.


//    Sort a given list of decimals in reverse order
List<Integer>sortedList=list.stream().
        filter(Objects::nonNull)
        .sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedList);
//    Write a Java 8 program to sort a given list of decimal numbers in reverse order.



//    Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter
       String concatString= strs.stream()
                .collect(Collectors.joining(",","[","]"));
        System.out.println(concatString);
//    Given a list of strings, write a Java 8 program to join the strings with '[' as a prefix, ']' as a suffix, and ',' as a delimiter.


//    Print the numbers from a given list of integers that are multiples of 5
        List<Integer>multipleOf5=list.stream().filter(Objects::nonNull)
                .filter(num->num%5==0)
                .toList();
//    Write a Java 8 program to print the numbers from a given list of integers that are multiples of 5.



//    Find the maximum and minimum of a list of integers
       int mini= list.stream()
               .filter(Objects::nonNull)
                .min(Comparator.naturalOrder())
                .get();
        System.out.println("minimum element "+mini);

       OptionalInt maxi = list.stream()
               .filter(Objects::nonNull)
               .mapToInt(Integer::valueOf)
               .max()
               ;
        System.out.println(maxi.orElse(-1));
//    Given a list of integers, write a Java 8 program to find the maximum and minimum numbers in the list.


//    Merge two unsorted arrays into a single sorted array using Java 8 streams
       int[] arr1={1,22,3,4,8,5,1,6};
       int[] arr2={7,3,9,0,1};
       List<Integer>sortedMergedArr=Stream.concat(
               stream(arr1).boxed(),
               stream(arr2).boxed())
               .sorted(Comparator.naturalOrder())
               .toList();
        System.out.println(sortedMergedArr);
//or  imp
        List<Integer>sortedMergedArr2=IntStream.concat(
                        stream(arr1),
                        stream(arr2))
                .sorted().boxed().toList();

        System.out.println(sortedMergedArr2);
//    Write a Java 8 program to merge two unsorted arrays into a single sorted array using the stream API.


//    Merge two unsorted arrays into a single sorted array without duplicates

        List<Integer>sortedMergedArr3=IntStream.concat(
                        stream(arr1),
                        stream(arr2))
                .distinct()
                .sorted().boxed().toList();

        System.out.println(sortedMergedArr3);
//    Write a Java 8 program to merge two unsorted arrays into a single sorted array without duplicates.



//    Get the three maximum and three minimum numbers from a given list of integers
        List<Integer>list3= asList(1,4);
         List<Integer>threeMaxi=list3.stream().sorted(Comparator.naturalOrder())
                 .limit(3)
                 .toList();
        System.out.println(threeMaxi);
        List<Integer>threeMini=list3.stream().sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println(threeMini);

//    Write a Java 8 program to get the three maximum and three minimum numbers from a given list of integers.



//    Check if two strings are anagrams or not using Java 8 streams

        String str1="listen";
        String str2="silent";
        String  a= str1.chars()
                .mapToObj(ch->(char)ch)
                .sorted(Comparator.naturalOrder())
                .map(String::valueOf)
                .collect(Collectors.joining(""));
       String b=str2.chars()
                        .mapToObj(ch->(char)ch)
                        .sorted(Comparator.naturalOrder())
                        .map(String::valueOf)
                        .collect(Collectors.joining(""));

        System.out.println("Two string are anagram  "+ a.equals(b));

//    Write a Java 8 program to check if two strings are anarams or not using the stream API and lambda expressions.


//    Find the sum of all digits of a number in Java 8
int num=102;
int sumOfDigits=String.valueOf(num)
                .chars()
                .map(ch->ch-'0')
                .sum();
        System.out.println("Sum of digits "+sumOfDigits);



//    Write a Java 8 program to find the sum of all digits of a given number.


//    Find the second largest number in an integer array
      int secondLargest=list.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.naturalOrder())
              .distinct()
                .skip(1)
                .findFirst().get();
        System.out.println("Second Largest "+secondLargest);
//    Write a Java 8 program to find the second largest number in an integer array.


//imp
//    Sort a list of strings according to the increasing order of their length
       Map<String,Integer>sortedStringList=strs.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(x->x,x->x.length()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2)->e1,
                        LinkedHashMap::new
                ))
               .entrySet().stream().limit(1).collect(Collectors.toMap(Map.Entry::getKey,
                       Map.Entry::getValue));
        System.out.println(sortedStringList);

//    Write a Java 8 program to sort a given list of strings according to the increasing order of their length.
        Comparator<String>cmp=(str12,str21)->str12.length()-str21.length();
        List<String>stringSortedLength=strs.stream()
                .filter(Objects::nonNull)
               .sorted(Comparator.comparing(String::length))
                //.sorted(cmp)
                .toList();
        System.out.println(stringSortedLength);

//    Find the sum and average of all elements in an integer array
       IntSummaryStatistics data= list.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.summarizingInt(x->x));
        System.out.println(data.getSum());
        System.out.println(data.getAverage());

//    Write a Java 8 program to find the sum and average of all elements in an integer array.
//imp
//    Find the common elements between two arrays
        Set<Integer>set= stream(arr1).boxed().collect(Collectors.toSet());
        List<Integer>commonElements= stream(arr2)
                .boxed()
                .filter(set::contains)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(commonElements);

//    Write a Java 8 program to find the common elements between two arrays using streams.


//    Reverse each char of a word using Java 8 streams
        String word="garima";
       String reverseWord=
              IntStream.range(0,word.length())
                      .map(i->word.charAt(word.length()-i-1))
                      .mapToObj(ch->(char)ch)
                      .map(String::valueOf)
                      .collect(Collectors.joining(""));

        System.out.println("reversedword   "+reverseWord);

//    Write a Java 8 program to reverse each word of a given list of string using the stream API and lambda expressions.

       List<String>reverseEachWord= strs.stream()
                .filter(Objects::nonNull)
                .map(st->new StringBuilder(st).reverse().toString())
                .toList();
        System.out.println(reverseEachWord);


//    Find the sum of the first 10 natural numbers
        int sumOf10Num=IntStream.rangeClosed(1,10)
                .sum();
        System.out.println(sumOf10Num);
//    Write a Java 8 program to find the sum of the first 10 natural numbers using streams.
//    Reverse an integer array

        int[] reversearr=IntStream.range(0,arr1.length)
                .map(i->arr1[arr1.length-i-1])
                .toArray();
        System.out.println(Arrays.toString(reversearr));
//    Write a Java 8 program to reverse an integer array.


//    Print the first 10 even numbers
     List<Integer>first10Even=Stream.iterate(2,n->n+2)
              .limit(10)
              .toList();
        System.out.println(first10Even);

//    Write a Java 8 program to print the first 10 even numbers.

//    Find the most repeated element in an array
     Map<Integer,Long>mp=list.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap
                        (Map.Entry::getKey,
                                Map.Entry::getValue,(e1,e2)->e1,
                                LinkedHashMap::new
                        )
                ).entrySet()
             .stream()
             .limit(1)
             .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(mp);


//    Write a Java 8 program to find the most repeated element in an array.

//    Check if a string is a palindrome using Java 8 streams
        String string="noon";

      boolean isPallindrome=IntStream.range(0,string.length()/2)
                .allMatch(i->string.charAt(i)==string.charAt(string.length()-1-i));
        System.out.println("isPallindrome "+isPallindrome);

//    Write a Java 8 program to check if a given string is a palindrome using the stream API and lambda expressions.

//    Find strings in a list that start with a number
       List<String>stringStartWithNum=strs.stream()
                .filter(Objects::nonNull)
                .filter(st->st.matches("^[0-9]+[a-zA-Z0-9]*"))
                .toList();
        System.out.println(stringStartWithNum);

//    Given a list of strings, write a Java 8 program to find the strings that start with a number.


//    Extract duplicate elements from an array
        List<Integer>duplicateList=list.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .map(entry->entry.getKey())
                .collect(Collectors.toList());
        System.out.println(duplicateList);
//    Write a Java 8 program to extract duplicate elements from an array.



//    Print duplicate characters in a string
          List<Character>duplicateChars=string.chars()
                .mapToObj(ch->(char)ch)
                  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                  .entrySet()
                  .stream()
                  .filter(entry->entry.getValue()>1)
                  .map(entry->entry.getKey())
                  .toList();
        System.out.println(duplicateChars);
//    Write a Java 8 program to print the duplicate characters in a string.


//    Find the first repeated character in a string

        String string2="helloworld";
        HashSet<Character>hashset=new HashSet<>();
       Optional<Character> firstRepeatedChar= string2.chars()
               .mapToObj(ch->(char)ch)
               .filter(ch->!hashset.add(ch))
                .findFirst();
        System.out.println("First Repeating Character "+firstRepeatedChar.get());





//    Write a Java 8 program to find the first repeated character in a string.


        //    Find the first non-repeated character in a string

        Optional<Map.Entry<Character,Long>>firstNonRepeatedChar=string2.chars()
                .mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet().stream()
                .filter(entry->entry.getValue()==1)
                .findFirst();

        System.out.println("First Non-RepeatingCharacter "+firstNonRepeatedChar.get());
//    Write a Java 8 program to find the first non-repeated character in a string.


//    Generate the Fibonacci series
        Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1]})
                .limit(10)
                .map(fib->fib[0])
                .forEach(System.out::println);

//    Write a Java 8 program to generate the Fibonacci series.

//    Print the first 10 odd numbers
        Stream.iterate(1,x->x+2)
                .limit(10)
                .forEach(System.out::println);
//    Write a Java 8 program to print the first 10 odd numbers.

//    Get the last element of an array
        int n = arr1.length;
        OptionalInt firstElement=Arrays.stream(arr1)
                .filter(ele->arr1[n-1]==ele)
                .findFirst();
        System.out.println(firstElement.getAsInt());

//    Write a Java 8 program to get the last element of an array.
//    Calculate the age of a person in years

        LocalDate today= LocalDate.now();
        LocalDate bday=LocalDate.parse("2002-03-03");
        System.out.println(Period.between(today,bday));

//    Write a Java 8 program to calculate the age of a person in years given their birthday.


   //Find the names which contains vowels
        List<String>names= List.of("garima","venu","Pooja","sky","om","try");
        names.stream().filter(name->name.matches(".*[aeiouAEIOU]+.*"))
                .forEach(System.out::println);

        //Find the names which contains consonant
        List<String>names2= List.of("garima","venu","Pooja","sky","om","try");
        names2.stream().filter(name->name.matches("^[^aeiouAEIOU]*$"))
                .forEach(System.out::println);

        // convert all names to uppercase
       List<String>upperCaseName= names.stream().map(x->x.toUpperCase()).toList();
        System.out.println(upperCaseName);

        // convert to map along with key an length and find max length key
       Map<String,Integer>lengthMap=names.stream()
                .collect(Collectors.toMap(s->s,s->s.length()))
                ;
        System.out.println(lengthMap);

        // find max length string
       Map.Entry<String,Integer>maxString=lengthMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get();
        System.out.println(maxString.getKey());

        // count vowels in all string
        names.stream()
                .forEach(name->{
                long vowelCount=name.chars().filter(ch->"aeiouAEIOU".indexOf(ch)>=0)
                            .count();
                    System.out.println(name+"  "+vowelCount);
                });
         // max vowel count in a list of  string
       String maxVowelString= names.stream().max(
             Comparator.comparing(name->{
             return name.chars().filter(ch->"aeiouAEIOU".indexOf(ch)>=0).count();
                })
        ).orElse("");
        System.out.println(maxVowelString);


        // find word that has longest length
        String sentence="The tallest building in Dubai is Burj Khalifa";
        String longestWord=Arrays.stream(sentence.split("\\s+"))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println("longest word "+longestWord);




    }
}