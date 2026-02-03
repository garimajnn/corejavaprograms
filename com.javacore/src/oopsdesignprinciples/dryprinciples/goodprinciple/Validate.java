package oopsdesignprinciples.dryprinciples.goodprinciple;
import oopsdesignprinciples.dryprinciples.badpractise.User;


// DRY - PRINCIPLE VALIDATE

public class Validate {
    public boolean isValidate(User user){
        if(user==null){
            throw new IllegalArgumentException();
        }
        if(user.getPassword().length()<8 ){
            throw new IllegalArgumentException();
        }
        return true;
    }
}
