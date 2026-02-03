package streamspractise.task1;

import com.sun.jdi.LocalVariable;

import java.time.LocalDate;
import java.util.Objects;

public class Student {
    private byte studentId;
    private final String firstName;
    private final   String lastName;
    private byte currentYear;

    public Student(byte studentId, String firstName, String lastName, byte currentYear) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentYear = currentYear;
    }

    public Student(byte studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentYear =(byte) LocalDate.now().getYear();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(byte studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(byte currentYear) {
        this.currentYear = currentYear;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return this.studentId==student.getStudentId() &&
                this.firstName.equalsIgnoreCase(student.getFirstName()) &&
                this.lastName.equalsIgnoreCase(student.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, firstName.toLowerCase(), lastName.toLowerCase());
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", currentYear=" + currentYear +
                '}';
    }
}
