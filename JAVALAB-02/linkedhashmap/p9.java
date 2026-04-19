package linkedhashmap;

//LinkedHashMap
//1. Traverse map and display eldest entered 4 elements only.

import java.util.*;

public class p9 {
 public static void main(String[] args) {

     LinkedHashMap<Integer, String> map =
         new LinkedHashMap<Integer, String>() {
             protected boolean removeEldestEntry(
                     Map.Entry<Integer, String> eldest) {
                 return size() > 4;
             }
         };

     map.put(1, "Apple");
     map.put(2, "Strawberry");
     map.put(3, "Pear");
     map.put(4, "Cucumber");
     map.put(5, "Grapes");

     for (Map.Entry<Integer, String> entry : map.entrySet()) {
         System.out.println(entry.getKey() + " = " + entry.getValue());
     }
 }
}