package solidprinciples.liskovsubstitution.employee.goosolution;

public class FullTimeEmployee implements MonthlyPaidEmployee {
    String name;
    private String address;


    public FullTimeEmployee(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public double getMonthlySalary() {
        return 2323;
    }
}
