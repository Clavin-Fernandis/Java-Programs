package hashmap;

//HashMap
//3. Copy all mappings from HashMap1 to HashMap2.

import java.util.*;

public class p3 {
 public static void main(String[] args) {

     HashMap<Integer, String> map1 = new HashMap<>();
     HashMap<Integer, String> map2 = new HashMap<>();

     map1.put(1, "Red");
     map1.put(2, "Green");
     map1.put(3, "Black");

     map2.put(4, "White");
     map2.put(5, "Blue");
     map2.put(6, "Orange");

     map2.putAll(map1);

     System.out.println("HashMap after copy: " + map2);
 }
}