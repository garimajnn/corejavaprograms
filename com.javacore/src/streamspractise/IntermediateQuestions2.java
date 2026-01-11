package streamspractise;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employees{
    private String name;
    private String dept;
    private double salary;
    private int age;
    public Employees(String name,double salary,String dept,int age){
        this.name=name;
        this.salary=salary;
        this.age=age;
        this.dept=dept;

    }

    public int getAge() {
        return age;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name+" "+salary + age;
    }
}
public class IntermediateQuestions2 {
    public static void main(String[] args) {
        Employees e1=new Employees("garima",23423.23,"HR",39);
        Employees e2=new Employees("pooja",909032.112,"Finance",22);
        Employees e3=new Employees("ginni",243562,"IT",66);
        Employees e4=new Employees("raju",77657.2,"HR",21);

        List<Employees> emplList=new ArrayList<>();
        emplList.add(e1);
        emplList.add(e2);
        emplList.add(e3);
        emplList.add(e4);


//        sort list of employees by salary.
        List<Employees>sortedSalaryAsc= emplList.stream()
                .sorted(Comparator.comparingDouble(x->x.getSalary()))
                .toList();
        System.out.println(sortedSalaryAsc);

//        sort list of employees in desc order by salary
        List<Employees>sortedSalDesc=
                emplList.stream()
                        .sorted
                                (Comparator.comparingDouble(Employees::getSalary).reversed())
                        .toList();

        System.out.println(sortedSalDesc);

//       calculate   avg age of person objects using streams

        OptionalDouble avgAge= emplList.stream()

                .mapToInt(x->Integer.valueOf(x.getAge()))
                .average();
        System.out.println(avgAge.getAsDouble());


// partion number into  as even and odd
        List<Integer>nums=List.of(1,2,3,4,5,6,7);
        Map<Boolean,List<Integer>> mp=nums.stream()
                .collect(Collectors.partitioningBy(x->x%2==0));
        System.out.println("Even"+ mp.get(true));


// group a list of words by their length using streams

        String[] arrs={"garima","pooja","riya","ginni","reeshu"};
        List<String>strs=new ArrayList<>(Arrays.asList(arrs));
        Map<Integer,List<String>>mps=strs.stream()
                .collect(Collectors.groupingBy(x->x.length()));
//                .collect(Collectors.groupingBy(x->x.length(),Collectors.toList()));
        System.out.println(mps);

//        count the occurence of each element in a list
        Map<String,Long>mpc= Arrays.stream(arrs)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mpc);

//         group employees by dept and calculate the avg salary

        Map<String,Double>deptSal=emplList.stream()
                .collect
                        (Collectors.groupingBy(Employees::getDept,Collectors.averagingDouble(Employees::getSalary)));
        System.out.println(deptSal);

//        find highest paid empl in each dept
        Map<String,Optional<Employees>>highestDeptSal=emplList.stream()
                .collect(Collectors.groupingBy(Employees::getDept,
                        Collectors.maxBy(Comparator.comparing(Employees::getSalary))
                ));
        System.out.println("highest paid employee "+highestDeptSal);

//    find all dept with more than 2 employees

        Map<String,Long>empInDept=emplList.stream()
                .collect(Collectors.groupingBy(Employees::getDept,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>=2)
                .collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
        System.out.println("Emp in each dept " +empInDept);

//  imp-  find dept with highest average salary

        Map.Entry<String,Double>deptHighSal=  emplList.stream()
                .collect(Collectors.groupingBy(
                        Employees::getDept,
                        Collectors.averagingDouble(Employees::getSalary)))
                .entrySet().stream().
                max(Map.Entry.comparingByValue())
                .orElseThrow();
        System.out.println(deptHighSal);


//    find most frequent character in string

        String s="garimajain";
        Optional<Map.Entry<String,Long>>freqChar=Arrays.stream(s.split(""))
                .collect(
                        Collectors.groupingBy(Function.identity(),
                                Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue());
        System.out.println(freqChar.orElseThrow());


//
//  vimp   find the first non-repeating character in String

        Optional<String>firstNonRepeating=Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy
                        (Function.identity(),
                                LinkedHashMap::new,
                                Collectors.counting()))
                .entrySet().stream()
                .filter(a->a.getValue()==1)
                .map(a->a.getKey())
                .findFirst();
        System.out.println(firstNonRepeating);

    }
}

