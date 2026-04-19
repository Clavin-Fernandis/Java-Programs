package treemap;

//TreeMap
//3. Remove all elements, add again, iterate and check size.

import java.util.*;

public class p7 {
 public static void main(String[] args) {

     TreeMap<Integer, String> map = new TreeMap<>();

     map.put(1, "Banana");
     map.put(2, "Orange");
     map.put(3, "Guava");
     map.put(4, "Pomegranate");
     map.put(5, "Amla");

     map.clear();

     System.out.println("Size after clear: " + map.size());

     map.put(1, "Banana");
     map.put(2, "Orange");
     map.put(3, "Guava");
     map.put(4, "Pomegranate");
     map.put(5, "Amla");

     for (Map.Entry<Integer, String> entry : map.entrySet()) {
         System.out.println(entry.getKey() + " = " + entry.getValue());
     }

     System.out.println("Size: " + map.size());
 }
}
