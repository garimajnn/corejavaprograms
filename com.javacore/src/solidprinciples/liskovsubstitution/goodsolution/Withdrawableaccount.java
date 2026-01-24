package solidprinciples.liskovsubstitution.goodsolution;

public interface Withdrawableaccount extends DepositableAccount {
    void withdraw(double amount);
}
