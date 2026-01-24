package solidprinciples.liskovsubstitution.problem;

public class Main {
    public static void main(String[] args) {

        Account account=new FixedDeposit(900);

        account.withdraw(22);


    }
}

