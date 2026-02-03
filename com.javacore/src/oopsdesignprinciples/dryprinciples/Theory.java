package oopsdesignprinciples.dryprinciples;

public class Theory {
    // I should avoid writing the same piece of code everywhere
    // I should write the duplicate code in the utils file and then import the same piece of code
    // so that DRY Principle can be achieved
    // Lets say ecom website mein jagha jagha price formatting  krte hai ,
    // Us logic ko har baar likhne ki jagha mein usko ek utils mein rakh sakte hu so that mera kaam
    // Here I will use the reusable component ,  functions ,modeules that can be used in differnet parts of my code
    // Also the chances of the error will also be reduced
    // Avoid the duplicate code



    // Break DRY PRINCIPLE - I should create a swap function to make it clean
    public static void main(String[] args) {
      int a= 10;
      int b= 30;
      // swap the a and b
      int temp=a;
      b=a;
      a=temp;
      System.out.println(a+" "+b);



      // swap x nd y
      int x=9;
      int y=4;

      temp= x;
      x=y;
      y=temp;
      System.out.println(x+" "+y);


      // Example
     /**
      * 1. Creating a button in the development
      * So instead of creating button everytime i will create a util class where i will write the logic
      * of creating button.
      *
      * 2. Avoid copy pasting same code everywhere
      * 3. Testing become easy if I have same independent functionality
      *
      * 4. To implement this,I should code  encapsulate repetitive code into the reusable functions or methods
      * 5 . I can have the interface,inheritance
      * */

     /**
      * ADVANTAGE
      * 1.CODE REUSABILITY
      * 2.SCALABILITY
      * 3.CONSISTENCY
      * 4.CLEAN CODE
      *
      * */


    /**
     * DISADVANTAGE
     * 1.TIGHT COUPLING - ADMIN PASSWORD LENGTH 12 S BADA , NORMAL USER PASSWORD LENGTH 8 SE BADA
     * HERE SMALL CHNAGE CAN BREAK THE LOGIC ..
     *
     * 2.Premature optimization
     * Applying DRY too early before requirements stabilize
     * Leads to wrong abstractions that need rework later
     * “Duplication is cheaper than the wrong abstraction.” — common software wisdom
     *
     * 3.Complex Refactoring - refactoring legacy code can be time consuming
     * */




    }
}
