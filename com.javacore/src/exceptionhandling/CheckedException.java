package exceptionhandling;

public class CheckedException {

    // occur at compiler time
    // its is needed to handle these error.
    // either use try-catch or throws keyword
    // example of ClassNotFound,FileNotFound,IOException

// Here if I won't write this in try-catch then it will throw error
    public static void main(String[] args) {
       try{
           Class.forName("com.package.garima");

       }
       catch(ClassNotFoundException err){
           System.out.println("class not found "+err.getMessage());
        }

}}
