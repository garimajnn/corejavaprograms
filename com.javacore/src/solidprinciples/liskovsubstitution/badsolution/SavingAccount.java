package solidprinciples.liskovsubstitution.badsolution;

public class SavingAccount implements Account {

    public void withdraw(){
        System.out.println("saving account withdraw");
    }
    public void deposit(){
        System.out.println("saving account deposit");
    }
}

