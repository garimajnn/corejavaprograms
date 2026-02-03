package solidprinciples.liskovsubstitution.employee.goosolution;

public class PartTimeEmployee implements HourlyPaidEmployee{
    String name;
    private double hoursWorked;
    private double hourlyWage;

    public PartTimeEmployee(String name, double hoursWorked, double hourlyWage) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }
    @Override
    public double getHourlySalary() {
        return hourlyWage;
    }

    @Override
    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}
