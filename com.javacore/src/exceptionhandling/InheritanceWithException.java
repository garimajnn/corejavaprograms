package exceptionhandling;



// these restriction or contract is with checked exception only
// in the unchecked exception there are not restriction

// parent check krenge toh they want hamare baccha hamse jyda galtiya ni kre


/*
*  Child has  overridden method and parent has a method
*  which throws exception then child can throw either no exception,same exception or
   child of parent method exception
   but it should not throw a higher exception
 * */
class Parent{
    public void show(String name){

        try{
            if(name==null){
                throw new Exception("Name must not be null");
            }
            System.out.println("parent show");
        }
        catch(Exception err){
            System.out.println(err.getMessage());
        }
    }
}
class Child extends Parent{
    public void show(String name){

        System.out.println("Child show"+name);

    }
}

public class InheritanceWithException {
    public static void main(String[] args) {


    Parent obj=new Parent();
    String name="garima";
    obj.show(name);
}
}
