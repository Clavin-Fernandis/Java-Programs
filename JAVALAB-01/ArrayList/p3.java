package ArrayList;

//3. Write a java program for getting different colors through ArrayList interface
//and sort them using Collections.sort().

import java.util.*;

public class p3 {
 public static void main(String[] args) {

     ArrayList<String> colors = new ArrayList<>();

     colors.add("Red");
     colors.add("Blue");
     colors.add("Green");
     colors.add("Yellow");

     System.out.println("Before Sorting: " + colors);

     Collections.sort(colors);

     System.out.println("After Sorting: " + colors);
 }
}
