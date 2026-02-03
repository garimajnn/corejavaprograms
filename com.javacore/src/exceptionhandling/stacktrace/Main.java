package exceptionhandling.stacktrace;




public class Main {

    public static void  A(){

        throw new IllegalArgumentException("error ");
    }
    public static void  B(){
             A();
    }
    public static void  C(){
            try{
                B();
            }
            catch(IllegalArgumentException e){
                e.printStackTrace();
            }

    }
    public static void  D(){
               C();
    }
    public static void  E(){
                 D();
    }
   public static void  F(){
         E();
    }
    public static void main(String[] args) {

        F();
    }
}
