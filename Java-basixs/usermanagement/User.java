package usermanagement;
import java.util.*;
public class User {

    private int userId;
    private String userName;

    // Constructor to initialize User with id and name
    User(int userId, String userName)
    {
        this.userId = userId;
        this.userName = userName;
    }

    // Getter for user id
    public int getId()
    {
        return userId;
    }

    // Getter for user name
    public String getName()
    {
        return userName;
    }

    // Setter to update user name
    public void setName(String userName)
    {
        this.userName = userName;
    }

    // Display user information
    public void displayInfo()
    {
        System.out.println("User Id: " + userId + " Name: " + userName);
    }
}
