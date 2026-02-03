package oopsdesignprinciples.kiss;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
//        Example 1
        // Avoid
        int a = 10;
        int b = a * 10;

        // Better
        int base_price = 10;
        int total_price = base_price * 10;


        List<Integer> list = List.of(1, 2, 3, 4);
        // Example 2
        // unnecessary adding complexity to list
        list.stream()
                .filter(x -> x > 10)
                .map(x -> x * 2)
                .forEach(System.out::println);

        // here work can be done in simple language
        for (int x : list) {
            if (x > 10) {
                System.out.println(x * 2);
            }
        }




    }

    // Example 3 - OVERENGINEERED
    String str = null;
    // here I need to check whether string is null or empty
    // avoid
    public boolean isEmptyStr(String str)
    {
        if (str == null) {
            return true;
        }
        else {
            if (str.length() == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
