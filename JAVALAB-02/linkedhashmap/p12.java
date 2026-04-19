package linkedhashmap;

//LinkedHashMap
//4. Add elements in same order using for loop and put().

import java.util.*;

public class p12 {
 public static void main(String[] args) {

     LinkedHashMap<String, Integer> map =
             new LinkedHashMap<>();

     String[] keys = {"C", "A", "B", "E", "D"};
     Integer[] values = {3, 1, 2, 5, 4};

     for (int i = 0; i < keys.length; i++) {
         map.put(keys[i], values[i]);
     }

     System.out.println(map);
 }
}