package streamspractise.task1;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    List<Student> studentList;
    public StudentList(){
       this.studentList=new ArrayList<>();
    }
    public void  addStudent(Student student){
        if(studentList.contains(student)){
            return;
        }
        studentList.add(student);
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
