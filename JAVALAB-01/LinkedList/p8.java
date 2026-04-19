package LinkedList;

//3. Write a Java program to insert the specified element at the end
//of a linked list using offerLast("Pink").

import java.util.*;

public class p8 {
 public static void main(String[] args) {

     LinkedList<String> list = new LinkedList<>();

     list.add("Red");
     list.add("Blue");
     list.add("Green");

     System.out.println("Before Insertion: " + list);

     list.offerLast("Pink");

     System.out.println("After Insertion: " + list);
 }
}