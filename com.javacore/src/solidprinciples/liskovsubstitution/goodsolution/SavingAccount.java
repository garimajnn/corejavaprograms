package solidprinciples.liskovsubstitution.goodsolution;

public class SavingAccount implements Withdrawableaccount {
    private double balance;

    public SavingAccount(double amt){
        balance=amt;
    }
    public void withdraw(double amount){

        if(amount<0){
            throw  new IllegalArgumentException("amount deposited cant be negative");
        }
        if(amount>balance){
            throw  new IllegalArgumentException("Insufficient balance in your account");
        }
        balance-=amount;
        System.out.println("Succesfully withdraw "+amount);
        System.out.println("Balanced left "+balance);
    }
    public void deposit(double amount){
        if(amount<0){
            throw  new IllegalArgumentException("amount deposited cant be negative");
        }
        balance+=amount;
        System.out.println("Balance credited" + amount);
        System.out.println("New Balance "+balance);
    }

    public void processTransaction(){
        deposit(321);
        withdraw(322);

    }
}
