package ArrayList;

//4. Write a java program for getting different colors through ArrayList interface
//and extract the elements 1st and 2nd using SubList().

import java.util.*;

public class p4 {
 public static void main(String[] args) {

     ArrayList<String> colors = new ArrayList<>();

     colors.add("Red");
     colors.add("Blue");
     colors.add("Green");
     colors.add("Yellow");

     System.out.println("Original List: " + colors);

     List<String> sub = colors.subList(0, 2);

     System.out.println("Extracted Elements: " + sub);
 }
}