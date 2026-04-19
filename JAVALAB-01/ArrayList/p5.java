package ArrayList;

//5. Write a java program for getting different colors through ArrayList interface
//and delete nth element from the ArrayList object using remove by index.

import java.util.*;

public class p5 {
 public static void main(String[] args) {

     ArrayList<String> colors = new ArrayList<>();

     colors.add("Red");
     colors.add("Blue");
     colors.add("Green");
     colors.add("Yellow");

     int n = 2; // delete 2nd element

     System.out.println("Original List: " + colors);

     colors.remove(n - 1);

     System.out.println("After Deleting " + n + "th Element: " + colors);
 }
}
