package usermanagement;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        
        // Add multiple users to the service
        try
        {
            userService.addUser(1, "nana");
            userService.addUser(5, "kaka");
            userService.addUser(2, "mama");

            // Display all users
            userService.displayAll();
            
            // Search and display user by id
            System.out.println("\nSearching a user");
            User foundUser = userService.getUserById(2);
            foundUser.displayInfo();

            // Attempt to add duplicate user
            userService.addUser(5, "kaka");

        }
        catch(DuplicateUserException | UserNotFoundException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }

        // Delete user and display remaining users
        try
        {
            userService.deleteUser(1);
            System.out.println("Total users after deletion: " + userService.getUserCount());
            userService.displayAll();

        }
        catch(UserNotFoundException e)
        {
            System.out.println("Error in deletion: " + e);
        }
    }
    
}
