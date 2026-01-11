package exceptionhandling;


// Custom unchecked exception

class CustomException extends RuntimeException{
    public CustomException(){
        super();
    }
    public CustomException(String msg){
        super(msg);
    }
}

public class MyCustomException {

    public static void main(String[] args) {
        String name=null;

            try {
                if(name==null){
                    throw new CustomException("Name must not be null");
                }
                System.out.println(name.toUpperCase());
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
}
