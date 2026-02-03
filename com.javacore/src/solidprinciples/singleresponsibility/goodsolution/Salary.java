package solidprinciples.singleresponsibility.goodsolution;


public class Salary {
    public double calculateSalary(Employee employee){
        int regularHours=Math.min(40,employee.workingHours);
        int overtimeHours=Math.max(0,employee.workingHours-30);
        double salary = (regularHours*(Employee.REGULAR_PAY_PER_HOUR)) + (overtimeHours*Employee.OVERTIME_PAY_PER_HOUR);
        return salary;
    }
}
