package solidprinciples.singleresponsibility.goodsolution;

public class Employee {

    final static  int  MIN_WORKING_HOUR=40;
    final static double REGULAR_PAY_PER_HOUR=800;
    final static double OVERTIME_PAY_PER_HOUR=1000;

    String name;
    int workingHours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

}
