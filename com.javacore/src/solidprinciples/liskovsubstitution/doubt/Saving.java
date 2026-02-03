package solidprinciples.liskovsubstitution.doubt;

public class Saving implements Account{
    int balance;
    public Saving(int balance){
        this.balance=balance;
    }

    @Override
    public int deposit(int amount) {

        if(amount<0){
            throw new IllegalArgumentException("invalid amount");
        }
        balance+=amount;
        return balance;

    }

    @Override
    public int withdraw(int amount) {
        if(amount<0){
            throw new IllegalArgumentException("invalid amount");
        }
        if(amount>balance){
            throw new IllegalArgumentException("invalid balance");
        }
        balance-=amount;
        return balance;
    }
}
