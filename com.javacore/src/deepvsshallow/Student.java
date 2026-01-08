package deepvsshallow;


// cloneable marker interface will acts
// as a marker for the class which will implement it
// ki you have a special behavior and you need to impleemnt that
// if you do that only then objects can have special behavior else
// will throw compile time checked exception


public class Student implements  Cloneable {
    public Student(int id,  String name,Address add) {
        this.id = id;
        this.add = add;
        this.name = name;
    }

    private int id;
    private String name;
    private Address add;


    protected Object clone() throws CloneNotSupportedException{
        Student student=null;
        try{
            student = (Student) super.clone();  // here only primitive will be copied

        }
        catch (CloneNotSupportedException err){
            System.out.println(err.getMessage());
        }
        student.add=(Address)this.add.clone();
        return student;
    }
}
