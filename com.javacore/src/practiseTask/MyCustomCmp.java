package practiseTask;

import java.util.Comparator;

public class MyCustomCmp implements Comparator<Student> {
    public  int compare (Student s1,Student s2){

        if( s1.getAge() == s2.getAge()){
            return s1.getId()- s2.getId();
        }
        return s1.getAge()-s2.getAge();
    }
}
