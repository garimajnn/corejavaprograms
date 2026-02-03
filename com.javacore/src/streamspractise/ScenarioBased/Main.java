package streamspractise.ScenarioBased;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Employee employee1=new Employee(1,"garima",602023,38);
        Employee employee2=new Employee(31,"shailja",32023,13);
        Employee employee3=new Employee(11,"rimsha",432023,30);
        Employee employee4=new Employee(51,"rima",2023,13);

        List<Employee>employeeList=new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

       Optional<Employee>maxLeaveTakerEmployee= employeeList.stream()
                .max(Comparator.comparingInt(Employee::getLeaveCount).
                        thenComparing(Employee::getName));
       maxLeaveTakerEmployee.ifPresent(employee -> employee.setSalary(employee.getSalary()-(employee.getSalary()*0.1)))      ;
        System.out.println(maxLeaveTakerEmployee.get().getSalary());
        System.out.println(maxLeaveTakerEmployee.get());





    }
}
