package linkedhashmap;

//LinkedHashMap
//3. Print formatted output.

import java.util.*;

public class p11 {
 public static void main(String[] args) {

     LinkedHashMap<String, Integer> programminglanguages =
             new LinkedHashMap<>();

     programminglanguages.put("Java", 1995);
     programminglanguages.put("Python", 1991);
     programminglanguages.put("JavaScript", 1995);
     programminglanguages.put("C++", 1985);

     for (Map.Entry<String, Integer> entry :
             programminglanguages.entrySet()) {

         System.out.println(entry.getKey()
                 + " was developed in "
                 + entry.getValue());
     }
 }
}
