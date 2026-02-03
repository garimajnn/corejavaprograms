package exceptionhandling.nestedtrycatchvsmultiplecatch;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
public class MultipleCatch {


    public void loginUser(String username, String password) {
        try {
            if (username == null || password == null) {
                throw new IllegalArgumentException("Username or password cannot be null");
            }

            // Simulating DB call
            if (username.equals("admin")) {
                throw new SQLException("Database not reachable");
            }

            // Simulating config issue
            if (username.equals("guest")) {
                throw new IOException("Config file missing");
            }

            System.out.println("Login successful");

        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());

        } catch (SQLException e) {
            System.out.println("Database error. Please try again later.");

        } catch (IOException e) {
            System.out.println("System error. Contact support.");
        }
    }

}
