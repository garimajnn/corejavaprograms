package solidprinciples.liskovsubstitution.problem;

public class FixedDeposit implements Account{

    private  double balance;
    public FixedDeposit(double balance){
        this.balance=balance;
    }
    @Override
    public void deposit(double amount) {
        if(amount<0){
            throw new IllegalArgumentException("Amount deposited cant be negative");
        }
        balance+=amount;
        System.out.println("fd deposit" + amount );
        System.out.println("Your balance in fd "+balance);
    }
    public void withdraw(double amount){
       throw new IllegalArgumentException("You cant withdraw");
    }
}
