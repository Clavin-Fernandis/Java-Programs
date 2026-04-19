package linkedhashmap;

//LinkedHashMap
//2. Add programming languages and print all.

import java.util.*;

public class p10 {
 public static void main(String[] args) {

     LinkedHashMap<String, Integer> programminglanguages =
             new LinkedHashMap<>();

     programminglanguages.put("Java", 1995);
     programminglanguages.put("Python", 1991);
     programminglanguages.put("JavaScript", 1995);
     programminglanguages.put("C++", 1985);

     System.out.println(programminglanguages);
 }
}