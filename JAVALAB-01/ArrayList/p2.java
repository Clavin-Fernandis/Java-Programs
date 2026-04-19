package ArrayList;

//2. Write a java program for getting different colors through ArrayList interface
//and remove the 2nd element and color "Blue" from the ArrayList.

import java.util.*;

public class p2 {
 public static void main(String[] args) {

     ArrayList<String> colors = new ArrayList<>();

     colors.add("Red");
     colors.add("Blue");
     colors.add("Green");
     colors.add("Yellow");

     System.out.println("Original List: " + colors);

     colors.remove(1);       // remove 2nd element
     colors.remove("Blue"); // remove by object

     System.out.println("After Removing: " + colors);
 }
}
