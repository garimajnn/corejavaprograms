package exceptionhandling;

// here its not compulsory to handle this error it wont affect program compiling
// they will be thrown at runtime throws sirf method ko batayga ki have error its parent class is responsible for handling error

public class UnCheckedException {
    public void printName(String name) throws IllegalArgumentException{
        if(name==null){
            throw new IllegalArgumentException("name must not be null");
        }
        System.out.println(name.toUpperCase());

    }
    public static void main(String[] args) {

        String name=null;
        UnCheckedException exception=new UnCheckedException();
        try {
            exception.printName(name);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
