import java.util.*;



class Employee{

    /*
     * Employee class having employeeName,id
     * @param employeeName
     * @param id
     * Implement equals and hashCode to uniquely identify the employeeDetails
     * */
    private String employeeName;
    private int id;
    public Employee(int id,String employeeName) {

        if(employeeName==null || employeeName.trim().length()==0){
            throw new IllegalArgumentException("employeeName must not be null or empty");

        }
        this.employeeName = employeeName.trim();
        this.id=id;
    }
    public String getEmployeeName(){
        return this.employeeName;
    }
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
    @Override
    public boolean equals(Object employee){
        if(employee==null){
            return false;

        }
        if(employee.getClass()!=getClass()){
            return false;
        }
        Employee otherEmp=(Employee) employee;
        return otherEmp.id==this.id;
    }
    @Override
    public String toString() {
        return employeeName + " " + id;
    }
}
class Company{
    /*
     * Company class having list of Employee adding employee to the companyList and printing them.
     *
     * @param Employee
     *
     * */
    private List<Employee>employeeList;
    public Company(){
        employeeList=new ArrayList<>();
    }

    public class App {
        /*
         * Main class adding employee to company and printing them
         * @throw Illegal ArgumentException if there is no employee in the company
         * */
        public static void main(String[] args) {

            Company company=new Company();
            try {
                Employee employee3 = new Employee(1, "garima jain");
                Employee employee1 = new Employee(2, "pooja");
                Employee employee2 = new Employee(3, null);
                company.addEmployee(employee3);
                company.addEmployee(employee1);
                company.addEmployee(employee1);
                company.printEmployeeUsingForEach();
                company.printEmployeeListUsingIterator();
            }
            catch (IllegalArgumentException err){
                System.out.println("Error "+err.getMessage()+" " +err);
            }


        }
    }
    //     adding employee to list
    public void  addEmployee(Employee employee){
        if(employeeList.contains(employee)){
            throw new RuntimeException("Duplicate employeename not allowed");

        }
        employeeList.add(employee);
    }
    public void  printEmployeeListUsingIterator(){
        if(employeeList==null){
            throw new IllegalArgumentException("employeeList must not be null");
        }
        System.out.println("Printing employeeName using iterator");
        Iterator<Employee> iterator=employeeList.iterator();
        while(iterator.hasNext()){
            Employee employee=iterator.next();
            System.out.println(
                    employee.getEmployeeName()
            );
        }
    }
    public void printEmployeeUsingForEach(){
        if(employeeList==null){
            throw new IllegalArgumentException("employeeList must not be null");
        }
        System.out.println("Prinitng employeeName using forEach");
        for(Employee employee:employeeList){
            System.out.println(employee.getEmployeeName());
        }
    }

}


public class Main {
    /*
     * Main class adding employee to company and printing them
     * @throw Illegal ArgumentException if there is no employee in the company
     * */



    public static void main(String[] args) {

        Company company=new Company();
        try {
            Employee employee3 = new Employee(1, "garima jain");
            Employee employee1 = new Employee(2, "pooja");
            Employee employee2 = new Employee(3, "po");
            company.addEmployee(employee3);
            company.addEmployee(employee1);
            company.addEmployee(employee2);
            company.printEmployeeUsingForEach();
        }
        catch (IllegalArgumentException err){
            System.out.println("Error "+err.getMessage()+" " +err);
        }
        catch (RuntimeException err){
            System.out.println(err.getMessage());
        }


    }
}

