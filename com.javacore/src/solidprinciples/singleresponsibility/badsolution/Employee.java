package solidprinciples.singleresponsibility.badsolution;



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


   // Accountant - actor
   // voilate SRP - If accountant change the logic of saving data then class will change
    public double calculateSalary(){
        int regularHours=Math.min(40,workingHours);
        int overtimeHours=Math.max(0,workingHours-30);
        double salary = (regularHours*REGULAR_PAY_PER_HOUR) + (overtimeHours*OVERTIME_PAY_PER_HOUR);
        return salary;
    }
    //  HR - actor
    // here Hr change the logic of saving data then class will change
    public String generateReport(){
        String report=name + " is working " + workingHours;
        return report;

    }
    // DBA actor
    // Here if DBA channge the database logic
    public void saveToDB(){
        System.out.println("saving data in mongoDb"+name);
    }

}

