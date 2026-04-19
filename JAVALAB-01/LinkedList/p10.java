package LinkedList;

//5. Write a Java program that swaps two elements
//(first and third elements) in a linked list.

import java.util.*;

public class p10 {
 public static void main(String[] args) {

     LinkedList<String> list = new LinkedList<>();

     list.add("Red");
     list.add("Blue");
     list.add("Green");
     list.add("Yellow");

     System.out.println("Before Swapping: " + list);

     Collections.swap(list, 0, 2);

     System.out.println("After Swapping: " + list);
 }
}