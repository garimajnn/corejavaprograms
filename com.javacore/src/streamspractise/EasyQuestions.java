package streamspractise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class EasyQuestions {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("garima", "pooja");
        list.stream();
        String[] strs = {"garima", "pooja"};
        Arrays.stream(strs);

        Stream.of(1, 2, 3, 4);

        Stream.generate(() -> 1);

        Stream.iterate(1, x -> x + 1);

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

// filter the even numbers in list to their squares
        nums.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

// convert numbers in list to squares
        nums.stream().map(x -> x * x).forEach(System.out::println);

        // square even numbers from list
        nums.stream().filter(x -> x % 2 == 0).map(x -> x * x).forEach(System.out::println);

// find the first number greater than 10 from list
        Integer a = nums.stream()
                .filter(x -> x > 1)
                .findFirst().get();
        System.out.println(a);


        // count how many numbers are greater than 3 from list
        Long greaterThan3 = nums.stream().filter(x -> x > 3).count();
        System.out.println(greaterThan3);

//     find the sum/product of all numbers in a list
        Integer sum= nums.stream().mapToInt(x->Integer.valueOf(x)).sum();
        System.out.println("sum of elements "+sum);

//        product
        nums.stream()
                .reduce(1,(x,y)->x*y);

//        sum of even numbs in list
        int evensum= nums.stream().filter(x->x%2==0)
                .mapToInt(y->(int)y).sum();
        System.out.println("Sum of even numbers" + evensum);

//        find the sum of maximum number in list
        int maxnum= nums.stream().
                mapToInt(x->Integer.valueOf(x))
                .max().getAsInt();
        System.out.println("Max element by mapToInt "+maxnum);
//        or
        int maxinum = nums.stream()
                .max((x, y) -> x - y).get();
        System.out.println("Max element by stream "+maxinum);

// sum of squares of even numbers in list
        List<Integer>sqOfEvens=nums.stream().filter(x->x%2==0)
                .map(x->x*x)
                .toList();
        System.out.println("square of evens "+sqOfEvens);


    }
}
