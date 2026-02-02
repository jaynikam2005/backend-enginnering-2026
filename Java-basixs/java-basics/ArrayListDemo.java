import java.util.*;



public class ArrayListDemo {
    
    public static void main(String[] args) {
        List <Integer> a= new ArrayList<Integer>();
        a.add(10);
        a.add(29);
        a.add(30);
        a.add(40);
        a.remove(1);
        

        for(int m:a)
        {
            System.out.println(m);
        }
        System.out.println(a.size());
    }
}
