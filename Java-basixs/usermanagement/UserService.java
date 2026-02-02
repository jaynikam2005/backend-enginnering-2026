/* 
List: Stores all users in order
Set: Blocks duplicate IDs instantly (.contains() is fast)
Map: Finds user by ID in O(1) time instead of searching List
Try/Catch: Handles exceptions safely without crashing 
*/




package usermanagement;
import java.util.*;
import java.io.*;

class DuplicateUserException extends Exception
{
    public DuplicateUserException(String message)
    {
        super(message);
    }
}

class UserNotFoundException extends Exception
{
    public UserNotFoundException(String message)
    {
        super(message);
    }
}




public class UserService 
{

    private Map<Integer, User> userMapById = new HashMap<Integer, User>();
    private Set<Integer> userIdSet = new HashSet<Integer>();
    private List<User> userList = new ArrayList<User>();

    public void addUser(int id, String name) throws DuplicateUserException
    {
        try {
            // Check if user ID already exists
            if (userIdSet.contains(id)) {
                throw new DuplicateUserException("User with id " + id + " already exists.");
            }
        
            // Create and store user in all data structures
            User newUser = new User(id, name);
            userList.add(newUser);
            userIdSet.add(id);
            userMapById.put(id, newUser);
        } catch (DuplicateUserException e) {
            throw e;
        }        


    }

    public User getUserById(int id) throws UserNotFoundException
    {
        try {
            // Retrieve user from map by ID
            User user = userMapById.get(id);
            if (user == null) {
                throw new UserNotFoundException("User with id " + id + " Not found...!");
            }
            return user;

        } catch (UserNotFoundException e) {
            throw e;
        }
    }

    public void displayAll()
    {
        // Return early if no users exist
        if (userList.isEmpty()) {
            System.out.println("No users in the system to display");
            return;

        }

        System.out.println("All the existing user are \n");
        // Iterate through users in insertion order
        for (User user : userList) {
            user.displayInfo();
        }
    }

    public void deleteUser(int id) throws UserNotFoundException
    {
        try {
            // Locate user by ID
            User user = userMapById.get(id);
            if (user == null) {
                throw new UserNotFoundException("User with id " + id + "Not found..! ");
            }

            // Remove from all data structures
            userList.remove(user);
            userIdSet.remove(id);
            userMapById.remove(id);
        } catch (UserNotFoundException e) {
            throw e;
        }
    }

    public int getUserCount()
    {
        return userList.size();
    }

    
    
}
