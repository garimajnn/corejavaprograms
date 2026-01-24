package solidprinciples.liskovsubstitution.goodsolution;

public class Client {
    public static void main(String[] args) {

       FixedDeposit fdAccount  = new FixedDeposit(122);
       SavingAccount savingAccount = new SavingAccount(10);

       savingAccount.withdraw(80);
       savingAccount.processTransaction();




    }
}
