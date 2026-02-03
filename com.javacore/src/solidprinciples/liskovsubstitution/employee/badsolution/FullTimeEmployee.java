package solidprinciples.liskovsubstitution.employee.badsolution;


class FullTimeEmployee extends Employee{
        public FullTimeEmployee() {
            super("garim","indore");
        }
        public double getMonthlySalary(){

            // monthly salary logic
            return 1000;
        }
    }

