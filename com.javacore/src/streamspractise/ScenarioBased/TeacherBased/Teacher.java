package streamspractise.ScenarioBased.TeacherBased;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Teacher {
    private int employeeId;
    private String teacherName;
    private double teacherSalary;
    private List<String> subjectList;

    public Teacher(int employeeId, String teacherName, double teacherSalary){
        this.employeeId = employeeId;
        this.teacherName = teacherName;
        this.teacherSalary = teacherSalary;
        subjectList=new ArrayList<>();
    }
    public Teacher(int employeeId, String teacherName, double teacherSalary, List<String> subjectList) {
        this.employeeId = employeeId;
        this.teacherName = teacherName;
        this.teacherSalary = teacherSalary;
        this.subjectList=new ArrayList<>(subjectList);

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public List<String> getSubjectList() {
        return subjectList;
    }

    public double getTeacherSalary() {
        return teacherSalary;
    }
    public boolean equals(Object teacher){
        if(teacher==null){
            return false;

        }
        if(getClass()!=teacher.getClass()){
            return false;
        }
        Teacher newTeacher=(Teacher)teacher;
        return newTeacher.employeeId==this.employeeId;
    }

    public void setTeacherSalary(double teacherSalary) {
        this.teacherSalary = teacherSalary;
    }

    public void addSubjects(String subject) {
        this.subjectList.add(subject);
    }

    public int hashCode(){
        return Objects.hash(employeeId);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "employeeId=" + employeeId +
                ", teacherName='" + teacherName + '\'' +
                ", teacherSalary=" + teacherSalary +
                ", subjectList=" + subjectList +
                '}';
    }
}
