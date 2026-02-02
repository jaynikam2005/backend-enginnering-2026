import java.util.*;

public class HashMapDemo
{
    public static void main(String[] args)
    {
        // In an API context, this HashMap would represent:
        // - Response body data from a GET request
        // - Database query results mapped to key-value pairs
        // - Cache storage for frequently accessed data
        Map<Integer, String> m = new HashMap<>();
        
        // These put() operations simulate storing data that would typically come from:
        // - Database rows (id, name)
        // - API request payload
        // - Service layer business logic
        m.put(200, "Bhai");
        m.put(300, "Tau");
        m.put(400, "Chacha");

        // This retrieval (m.get(300)) simulates:
        // - GET /api/users/300 endpoint returning a user object
        // - Cache lookup for user data
        System.out.println(m.get(300));

        // This iteration would appear in API endpoints that return collections:
        // - GET /api/users endpoint returning all users as JSON array
        // - Response serialization in REST API controllers
        // - Data transformation before sending to client
        for (Map.Entry<Integer,String> i: m.entrySet())
        {
            System.out.println(i);
        }
    }
}
