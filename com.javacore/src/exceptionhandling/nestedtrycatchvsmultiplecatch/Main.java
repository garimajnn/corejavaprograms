package exceptionhandling.nestedtrycatchvsmultiplecatch;

public class Main {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2};
            System.out.println(arr[5]);   // ArrayIndexOutOfBoundsException
            int x = 10 / 0;               // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index problem");
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        }

        try {
            // Critical operation
            System.out.println("Order processing started");

            try {
                // Non-critical operation
                int x = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: calculation failed");
            }

            System.out.println("Continue order processing");

        } catch (Exception e) {
            System.out.println("Outer catch: order failed");
        }

    }
}
