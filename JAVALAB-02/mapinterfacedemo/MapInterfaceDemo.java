package mapinterfacedemo;

//2. Develop a Java program for adding elements [Apple, Banana, Orange] into HashMap,
//TreeMap and LinkedHashMap to perform various operations.

import java.util.*;

public class MapInterfaceDemo {

 public static void main(String[] args) {

     // HashMap Demonstration
     System.out.println("=== HashMap Demonstration ===");

     HashMap<String, Integer> hashMap = new HashMap<>();

     hashMap.put("Apple", 1);
     hashMap.put("Banana", 2);
     hashMap.put("Orange", 3);

     System.out.println("Initial HashMap: " + hashMap);

     hashMap.put("Apple", 5);
     System.out.println("After updating Apple's value: " + hashMap);

     hashMap.putIfAbsent("Apple", 10);
     hashMap.putIfAbsent("Grape", 4);

     System.out.println("After putIfAbsent operations: " + hashMap);

     System.out.println("Value for Apple: " + hashMap.get("Apple"));
     System.out.println("Value for Mango: " + hashMap.get("Mango"));
     System.out.println("Default value for Mango: "
             + hashMap.getOrDefault("Mango", 0));

     hashMap.remove("Banana");
     System.out.println("After removing Banana: " + hashMap);

     hashMap.remove("Apple", 5);
     System.out.println("After conditional remove: " + hashMap);


     // TreeMap Demonstration
     System.out.println("\n=== TreeMap Demonstration ===");

     TreeMap<String, Integer> treeMap = new TreeMap<>();

     treeMap.put("Alice", 95);
     treeMap.put("Bob", 82);
     treeMap.put("Charlie", 90);
     treeMap.put("David", 78);
     treeMap.put("Eva", 88);

     System.out.println("TreeMap contents: " + treeMap);
     System.out.println("Charlie's score: " + treeMap.get("Charlie"));

     treeMap.remove("David");
     System.out.println("After removing David: " + treeMap);

     System.out.println("First entry: " + treeMap.firstEntry());
     System.out.println("Last entry: " + treeMap.lastEntry());


     // LinkedHashMap Demonstration
     System.out.println("\n=== LinkedHashMap Demonstration ===");

     LinkedHashMap<String, Integer> linkedMap =
             new LinkedHashMap<String, Integer>() {

         protected boolean removeEldestEntry(
                 Map.Entry<String, Integer> eldest) {
             return size() > 3;
         }
     };

     linkedMap.put("A", 1);
     linkedMap.put("B", 2);
     linkedMap.put("C", 3);

     System.out.println("Initial LinkedHashMap: " + linkedMap);

     linkedMap.put("D", 4);

     System.out.println("After adding D: " + linkedMap);


     // Map Iteration
     System.out.println("\n=== Map Iteration ===");

     for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
         System.out.println(entry.getKey()
                 + " -> " + entry.getValue());
     }


     // Map Operations
     System.out.println("\n=== Map Operations ===");

     HashMap<String, Integer> map1 = new HashMap<>();
     map1.put("A", 1);
     map1.put("B", 2);

     HashMap<String, Integer> map2 = new HashMap<>();
     map2.put("B", 3);
     map2.put("C", 4);

     map2.forEach((key, value) ->
             map1.merge(key, value, (v1, v2) -> v1 + v2));

     System.out.println("After merging maps: " + map1);


     // Compute Operations
     System.out.println("\n=== Compute Operations ===");

     map1.compute("A", (k, v) -> v * 2);
     map1.computeIfPresent("B", (k, v) -> v * 3);
     map1.computeIfAbsent("D", k -> 10);

     System.out.println("After compute operations: " + map1);


     // Bulk Operations
     HashMap<String, Integer> newMap = new HashMap<>();
     newMap.putAll(map1);

     System.out.println("After putAll: " + newMap);

     newMap.clear();

     System.out.println("After clearing: " + newMap);


     // Checking Operations
     System.out.println("\n=== Checking Operations ===");

     System.out.println("Is map empty? " + newMap.isEmpty());
     System.out.println("Map size: " + map1.size());
     System.out.println("Contains key A? " + map1.containsKey("A"));
     System.out.println("Contains value 1? "
             + map1.containsValue(1));
 }
}