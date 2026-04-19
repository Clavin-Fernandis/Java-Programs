package ArrayList;

//1. Write a java program for getting different colors through ArrayList interface
//and search whether the color "Red" is available or not.

import java.util.*;

public class p1 {
 public static void main(String[] args) {

     ArrayList<String> colors = new ArrayList<>();

     colors.add("Blue");
     colors.add("Red");
     colors.add("Green");
     colors.add("Yellow");

     System.out.println("Colors List: " + colors);

     if (colors.contains("Red")) {
         System.out.println("Red is available in the ArrayList.");
     } else {
         System.out.println("Red is not available in the ArrayList.");
     }
 }
}
