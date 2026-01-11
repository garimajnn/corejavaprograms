package streamspractise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Student{
    private String name;
    private int grade;
    Student(String name,int grade){
        this.grade=grade;
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public int getGrade(){
        return this.grade;
    }

    @Override
    public String toString() {
        return name+grade ;
    }
}
public class IntermediateQuestions {
    public static void main(String[] args) {


//        1. Given a sentence,find and print the frequency of each word
        String sentence="Java is a programming lang . Java is versatile";
        Map<String,Long> wordfreqMap= Arrays.stream(sentence.split("\\s+"))
                .collect(Collectors.groupingBy(s->s,Collectors.counting()));
        System.out.println(wordfreqMap);

//     intresting     2.Given a list of numbers find out all numbers starting with 1.

        List<Integer> nums=Arrays.asList(2,3,1,100,123,1456);

        List<Integer>startsWith1=nums.stream()
                .filter(n->String.valueOf(n).startsWith("1"))
                .toList();
        System.out.println(startsWith1);

// 3. given  a list of names , group by their first letter and then count the number of names in each group

        String[] names={"garimajain","elephant","ram","muskan","menu","pooja","raju","gayan"};
        Map<Character,Long>groupconcat=  Arrays.stream(names)
                .collect(Collectors.groupingBy(x->x.charAt(0),Collectors.counting()));
        System.out.println(groupconcat);

//      4. find and print duplicate numbers in an array if it contains duplicate.


        List<Integer>duplicateList=Arrays.asList(2,2,1,1,3,3,5,6,7,7,8,9,0,34);
        Map<Integer,Long>list = duplicateList.stream()
                .collect(Collectors.groupingBy(x->x,Collectors.counting()));

//                or

//        IMP
        int[] arr={2,2,1,1,3,3,5,6,7,7,8,9,0,34};
        Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(x->x,Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);


//   5 How are duplicates removed from a array?

        int[] newarr= Arrays.stream(arr)
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(newarr));

//        6. Given a list of words,filter and print the pallindromes
        List<String>strings=List.of("level","radar","world","deed");
        strings.stream()
                .filter(s->new StringBuilder(s).
                        reverse().toString().equals(s))
                .forEach(System.out::println);


//   imp     7. merge two sorted arrays into single array?
        int [] ar1={1,2,5};
        int[] ar2={2,4,6,8};
        int[] mergedArr= IntStream.concat(Arrays.stream(ar1),Arrays.stream(ar2))
                .sorted() // yaad rakhna Comparator are for object streams not for primitive streams
                .toArray();
        System.out.println(mergedArr);


//       8. given two lists of strings,concatenate them and remove duplicates
        List<String>list1=Arrays.asList("ber","kiwi","banana");
        List<String>list2=Arrays.asList("mango","ber","banana");

        List<String>concatFruits= Stream.concat(list1.stream(),list2.stream())
                .distinct()
                .toList();
        System.out.println(concatFruits);

//   9 Student grade classification - 70 and above
        Student s1=new Student("garaim",90);
        Student s2=new Student("ram",70);
        Student s3=new Student("araim",80);
        Student s4=new Student("karaim",30);

        List<Student>studentList=new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        Map<String,List<Student>>ans=studentList.stream()
                .collect(Collectors.groupingBy(s->s.getGrade()>=70?"pass":"fail" ,Collectors.toList()));
        System.out.println(ans);



//        10 sort a list in order of increading order of their length
        List<String>sortedNames = Arrays.stream(names)
                .sorted(Comparator.comparingInt(String::length))
                .toList(); // Stream ko array mein convert kiya
        System.out.println((sortedNames));

//  11 intersection of 2 arrays of integer
//        IntStream.concat(Arrays.stream(ar1),Arrays.stream(ar2))
//                .()
    }
}