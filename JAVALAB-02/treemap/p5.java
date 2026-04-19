package treemap;

//TreeMap
//1. Traverse / iterate all keys with values.

import java.util.*;

public class p5 {
 public static void main(String[] args) {

     TreeMap<Integer, String> tree_map = new TreeMap<>();

     tree_map.put(1, "Apple");
     tree_map.put(2, "Strawberry");
     tree_map.put(3, "Pear");
     tree_map.put(4, "Cucumber");
     tree_map.put(5, "Grapes");

     for (Map.Entry<Integer, String> entry : tree_map.entrySet()) {
         System.out.println(entry.getKey() + " = " + entry.getValue());
     }
 }
}