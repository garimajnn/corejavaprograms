package streamspractise.ScenarioBased.TeacherBased;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TeacherHelper {

    List<Teacher> subjectTeachesByTeacher(List<Teacher>allTeachers,String subject){
     List<Teacher>subjectTeacherTeaches=allTeachers.stream()
                .filter(teacher->teacher.getSubjectList().contains(subject))
                .toList();
     return subjectTeacherTeaches;
    }
    Set<String>busyTeacher(List<Teacher>allTeachers){
       Set<String> uniqeBusyTeacher=allTeachers.stream()
                .filter(teacher->(teacher.getSubjectList().size()>=3))
                .distinct()
                .map(teacher -> teacher.getTeacherName())
                .collect(Collectors.toSet());
       return uniqeBusyTeacher;
    }

    public static void main(String[] args) {
        Teacher teacher1=new Teacher(1,"garima",2323);
        Teacher teacher2=new Teacher(2,"pooja",95453);
        Teacher teacher3=new Teacher(3,"pooja",95453);
        Teacher teacher4=new Teacher(4,"isha",95453);
        Teacher teacher5=new Teacher(5,"pooja",95453);
        teacher2.addSubjects("hindi");
        teacher1.addSubjects("english");
        teacher2.addSubjects("english");
        teacher3.addSubjects("science");
        teacher4.addSubjects("science");
        teacher4.addSubjects("hindi");
        teacher4.addSubjects("maths");
        teacher5.addSubjects("english");



        List<Teacher>teacherList=new ArrayList<>();
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher4);
        teacherList.add(teacher5);
        teacherList.add(teacher3);


        TeacherHelper teacherHelper=new TeacherHelper();
       List<Teacher>teachers= teacherHelper.subjectTeachesByTeacher(teacherList,"english");
        System.out.println(teachers);

      Set<String>busyteachers= teacherHelper.busyTeacher(teacherList);
        System.out.println(busyteachers);

    }
}
