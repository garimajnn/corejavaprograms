package practiseTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> marks= new ArrayList<>(Arrays.asList(100,300,20));
        var student1=new Student(1,"garima jain",marks,21);
        Student student2=new Student(13,"garima jain",marks,21);
        Student student3=new Student(16,"garima jain",marks,21);

        System.out.println(student1);
        marks.add(2,40);
        System.out.println(student2);

        List<Student>studentList=new ArrayList<>();
        studentList.add(student1);
        System.out.println(student2.getMarks());
        System.out.println(student1.getMarks());
        studentList.add(student3);
        studentList.add(student3);

        // sorting the student by age

        studentList.sort(new MyCustomCmp());



    }
}
