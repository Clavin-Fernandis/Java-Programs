package hashmap;

//HashMap
//4. Check whether map is empty or not before and after removing elements.

import java.util.*;

public class p4 {
 public static void main(String[] args) {

     HashMap<Integer, String> map = new HashMap<>();

     map.put(1, "Red");
     map.put(2, "Green");
     map.put(3, "Black");
     map.put(4, "White");
     map.put(5, "Blue");

     System.out.println("Is Empty? " + map.isEmpty());

     map.clear();

     System.out.println("Is Empty after clear? " + map.isEmpty());
 }
}