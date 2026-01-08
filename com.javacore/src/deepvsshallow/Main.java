package deepvsshallow;


// two object and two reference variable
// here both deep and shallow copy will be done
// primitive data will be in shallow copy
// objects will undergo deep copy
// by default shallow copy hoti obj1=obj2
// deep copy k liye we can use clone method
// if a method can throw exception and
// we have handled it but its ouput may depend on function which called it then we should
// use throws keyword there as well
// marker interface - empty interface cloneable


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address add1=new Address("Kala Mahal","Sironj","Madhya Pradesh");
        Student student1=new Student(1,"garima",add1);

        Student student2=(Student) student1.clone(); // deep copy
        Student student3=student1; // shallow copy

        System.out.println(student2);
        System.out.println(student1);
        System.out.println(student3);



        // Arraylist implements cloneable
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> list2 = (ArrayList<Integer>) list.clone();

        list2.set(2,100);
        list2.get(2);
        list.get(2);
        System.out.println(list);
        System.out.println(list2);



    }
}
