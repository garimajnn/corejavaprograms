package exceptionhandling;


// Implementing own try-with-resource


/*
AutoCloseAble -> interface in which class which implements
it needs to release its resource when they are no longer needed.
*/


class MyResouce implements AutoCloseable{

    public void show(){
        System.out.println("myresource show");
    }

    public void close() throws Exception {
        System.out.println("close things");
    }
}


public class TryWithResources {

    public static void main(String[] args) {
        try(MyResouce myResouce=new MyResouce()){
            System.out.println("try method");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
