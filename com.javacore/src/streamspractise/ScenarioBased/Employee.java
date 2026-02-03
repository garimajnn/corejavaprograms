package streamspractise.ScenarioBased;

final public class Employee {
    // final class
    // constructor
    // no setter
    // private variable
    private int id;
    private String name;
    private double salary;
    private int leaveCount;

    public Employee(int id,String name, double salary, int leave){
        this.id = id;
        this.name = name;
        this.leaveCount = leave;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getLeaveCount() {
        return leaveCount;
    }
    public String toString(){
        return (id+"  "+name+" "+ leaveCount +" "+salary);
    }


}
