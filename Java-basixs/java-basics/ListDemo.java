

import java.util.ArrayList;

import java.util.*;


public class ListDemo {
    public static void main(String[] args) 
    {
        List <Integer> nums= new ArrayList<Integer>();
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(6);
       
        

        for(int m: nums)
        {

            System.out.println(m *2) ;
        }
    }
}