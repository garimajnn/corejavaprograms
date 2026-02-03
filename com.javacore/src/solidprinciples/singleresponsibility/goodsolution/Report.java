package solidprinciples.singleresponsibility.goodsolution;

public class Report {
    String generateReport(Employee employee){
        String report=employee.name + " is working " + employee.workingHours;
        return report;
    }
}
