package solidprinciples.liskovsubstitution.employee.badsolution;

public  class PartTimeEmployee extends Employee{
  private int month;
  private int hours;

    public   PartTimeEmployee() {
        super("pooja", "indore");
    }

        public double getMonthlySalary(){
            // monthly salary logic
            if(hours<0) {
                throw new IllegalArgumentException("Hours cant be negative");
            }
            return 1000;
        }

        // because they sometimes paid hourly
        // sometime it can be zero or throw illegalArgumeentException
        // monthly salary logic depends on month else 0 or throw exception


         // Agar main employee.getSalary() krunge toh mujhe 0 ya error milne k chances hai isliye
    // main mere code ko aisa kuch kru parent ke object se jb call kru mere subclass k method bhi
  //  toh mujhe same behavior mile


    }

// SOLUTION- INTERFACE FULLMONTHPAIDEMPLOYEE INTERFACE,HOURLYPAIDEMPLOYEE