package solidprinciples.liskovsubstitution.badsolution;

public class Client {
    public static void main(String[] args) {
// Here account is tightly coupled single responsibility ko break krdia

// Maine jb client banaya toh  usko ab account bhi dekhna padega
        // konsa account hai uss method ko call krega

/**
 * Also kal maine doosra account open kra toh usme kuch aur condition hogi ki usko kya kya krna chahiye
 * wo account kis kis account ko khol skta hai phir kya krenge isliye
 * jiski wajha se open close principle bhi break  ho jayga
 *
 * */


/**
 * Client hamesha abstraction se baate krta haii
 * usko hum ni batate andar ka kuch bhi
 *
 * */

/**
 * Solution hai hum ek new interface banayenge
 *
 * */

        Account account=new FixedDeposit();
        account.deposit();

        if(account instanceof FixedDeposit){
            System.out.println("Skipping withdrwal for FD.");
        }
        else {
            try {
            account.withdraw();
        } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

