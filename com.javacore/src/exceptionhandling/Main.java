package exceptionhandling;

import java.io.Closeable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("exception");
        System.out.println("garima checked exception");

/**
 *
 * An event that affects the normal flow of the program, but we can handle or
 * control it using mechanisms like try-catch or throws.
 * Exceptions usually occur due to problems in the program logic,
 * external resources, or invalid inputs, but the program can recover from them.
 *
 * */



/**
 * A serious problem that occurs in the system or JVM which
 * we usually cannot handle programmatically .
 * Errors represent issues like memory exhaustion or stack overflow.
 * To fix them, we need to correct the underlying problem in
 * the code or environment and restart the program.
 *
 * */


/**
 *
 * Checked exceptions are checked at compile time.
 *
 * The compiler will not compile the program unless these exceptions are handled.
 *
 * They must be handled using either:
 *
 * try–catch block or
 *
 * throws keyword in the method declaration.
 *
 * They usually represent recoverable conditions.
 *
 * */

/**
 * Unchecked exceptions are checked at runtime. The compiler does not force handling them,
 * as they usually represent programming errors
 * such as logical mistakes or invalid usage of code.
 *
 * */


/**
 * How you handle exception ?
 * 1.try catch
 * 2. try catch finally
 * 3. multiple catch
 * 4. custom exception
 * 5. throws
 * 6. throw -> use to explicility throw an exception
 *
 * */


/**
 * Exception propagation means the process of how an exception
 * moves from the method where it occurs to
 * the calling methods until it is handled or the program terminates.
 *
 * */

/**
 * So okay we can can throws keyword is used mainly to propagate the message
 * */


//        What is an exception in Java? How does it differ from an error?
//                What are the main types of exceptions in Java?
//        What is the difference between checked and unchecked exceptions in Java?
//                How do you handle exceptions in Java?
//                What is the purpose of the try, catch, and finally blocks in Java?
//                Can you have multiple catch blocks for a single try block? How does Java determine which catch block to execute?
//                What happens if an exception is not caught in Java?
//                What is the difference between throw and throws in Java?
//        How do you create a custom exception in Java?
//                What is exception propagation in Java?
//                What is the use of the finally block? Will it always execute?
//                What is the try-with-resources statement in Java? How is it different from a finally block?
//                Can you catch multiple exceptions in a single catch block? How?
//                What are best practices for exception handling in Java?
//        How do you log exceptions in Java?
//                What is the stack trace? How can you print it?
//                Can you rethrow an exception in Java? Why would you do that?
//                What is the difference between Exception and RuntimeException?
//                What is the role of the Throwable class in Java?
//        How do you handle exceptions in multi-threaded Java applications?

    }
}
