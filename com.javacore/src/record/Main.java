package record;

record EmployeeRecord(String name, double salary) {
    public EmployeeRecord {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must not be null or empty");
        }
        if (salary < 0) {
            throw new IllegalArgumentException("Salary must be positive");
        }
        name = name.trim(); // reassign to canonical parameter
    }
}
public class Main{
    public static void main(String[]args)
    {
        try{
            EmployeeRecord emp=new EmployeeRecord("Garima",89732);

        }
        catch (IllegalArgumentException err){
            System.out.println(err.getMessage());
        }
    }
}