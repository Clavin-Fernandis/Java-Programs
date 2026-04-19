package LinkedList;

//2. Write a Java program to iterate a linked list in reverse order.

import java.util.*;

public class p7 {
 public static void main(String[] args) {

     LinkedList<String> list = new LinkedList<>();

     list.add("Red");
     list.add("Blue");
     list.add("Green");
     list.add("Yellow");

     System.out.println("Linked List: " + list);

     Iterator<String> itr = list.descendingIterator();

     System.out.println("Reverse Order:");

     while (itr.hasNext()) {
         System.out.println(itr.next());
     }
 }
}