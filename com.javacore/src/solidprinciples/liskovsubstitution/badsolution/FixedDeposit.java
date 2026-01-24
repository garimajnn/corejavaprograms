package solidprinciples.liskovsubstitution.badsolution;

public class FixedDeposit implements Account {

    @Override
    public void deposit() {
        System.out.println("fd deposit");
    }
    public void withdraw(){
        throw new RuntimeException();
    }
}
