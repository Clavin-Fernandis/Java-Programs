package hashmap;

//HashMap
//2. Remove all elements, verify size zero, add again and check size.

import java.util.*;

public class p2 {
 public static void main(String[] args) {

     HashMap<Integer, String> map = new HashMap<>();

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

     System.out.println("Size after adding again: " + map.size());
 }
}