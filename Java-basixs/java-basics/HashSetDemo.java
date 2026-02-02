import java.util.*;

public class HashSetDemo
{
    public static void main(String[] args)
    {
        Set<Integer>n=new HashSet<Integer>();
        n.add(19);
        n.add(19);
        n.add(25);
        n.add(10);
        n.add(9);

        Iterator<Integer> i=n.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}