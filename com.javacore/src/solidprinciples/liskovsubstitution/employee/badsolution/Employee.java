package solidprinciples.liskovsubstitution.employee.badsolution;


public abstract  class Employee {
    String name;
    String address;
    public Employee(String name,String address){
        this.address=address;
        this.name=name;
    }
    abstract double getMonthlySalary();
}


