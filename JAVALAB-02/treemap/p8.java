package treemap;

//TreeMap
//4. Get first and last key.

import java.util.*;

public class p8 {
 public static void main(String[] args) {

     TreeMap<String, String> map = new TreeMap<>();

     map.put("C2", "Red");
     map.put("C1", "Green");
     map.put("C4", "Black");
     map.put("C3", "White");

     System.out.println("First Key: " + map.firstKey());
     System.out.println("Last Key: " + map.lastKey());
 }
}