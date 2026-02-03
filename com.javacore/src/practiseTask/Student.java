package practiseTask;

import java.util.ArrayList;
import java.util.List;

public  class Student {
    private final int id;
    private final int age;
    private final String name;
    private  List<Integer> marks;

    public Student(int id,String name,List<Integer>mymarks,int age){

        this.id=id;
        this.age=age;
        this.name=name;
        List<Integer>temp=new ArrayList<>();
        //deep copy
//        for(int i=0;i<mymarks.size();i++){
//            temp.add(mymarks.get(i));
//        }
        temp.addAll(mymarks);
        marks=temp;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMarks() {

        return marks;
    }

    @Override
    public String toString() {
        return "MyImmutable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
