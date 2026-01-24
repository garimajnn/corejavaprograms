package solidprinciples.liskovsubstitution.goodsolution;

public class FixedDeposit implements DepositableAccount {


    private double balance;
    public FixedDeposit(double amt){
        balance=amt;
    }

    public void deposit(double amount){
        try {
            if (amount < 0) {
                throw new IllegalArgumentException("amount deposited cant be negative");
            }
            balance += amount;
            System.out.println("Balance credited" + amount);
            System.out.println("New Balance " + balance);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void processTransaction(){
        deposit(321);


    }
}
