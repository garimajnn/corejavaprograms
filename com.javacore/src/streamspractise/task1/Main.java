package streamspractise.task1;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student s1=new Student((byte)2,"Garima","Jain",(byte) 2021);
        Student s2=new  Student((byte)1,"Garima","Jain",(byte) 2022);

      StudentList studentList=new StudentList();
      studentList.addStudent(s1);
      studentList.addStudent(s2);
      List<Student>allStudents=studentList.getStudentList();

      PostCredential postCredential=new PostCredential();
      postCredential.createListOfUserNames(allStudents);

    }
}
