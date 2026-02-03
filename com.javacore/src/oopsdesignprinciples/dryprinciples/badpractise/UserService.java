package oopsdesignprinciples.dryprinciples.badpractise;

/**
 * Here I am repeating the code again and again
 * */
public class UserService {
    public void register(User user){
       if(user.getPassword().length()<8){
           throw new IllegalArgumentException("Invalid password");
       }
       if(user.getName()==null || user.getName().isEmpty()){
           throw new IllegalArgumentException("User name must not be null or empty");
       }
       System.out.println("User register");
    }
    public void updateUserProfile(User user){

        if(user.getPassword().length()<8){
            throw new IllegalArgumentException("Invalid password");
        }
        if(user.getName()==null || user.getName().isEmpty()){
            throw new IllegalArgumentException("User name must not be null or empty");
        }
        System.out.println("User profile register");
    }
}
