package hashmap;

//HashMap
//1. Write a Java program to traverse / iterate all the keys with specified values.

import java.util.*;

public class p1 {
 public static void main(String[] args) {

     HashMap<Integer, String> map = new HashMap<>();

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