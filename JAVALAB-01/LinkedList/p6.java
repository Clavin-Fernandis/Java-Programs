package LinkedList;

//1. Write a Java program to iterate through all elements in a linked list
//starting at the specified position (2nd) using iterator.

import java.util.*;

public class p6 {
 public static void main(String[] args) {

     LinkedList<String> list = new LinkedList<>();

     list.add("Red");
     list.add("Blue");
     list.add("Green");
     list.add("Yellow");

     System.out.println("Linked List: " + list);

     Iterator<String> iteratorobj = list.listIterator(1);

     System.out.println("Elements from 2nd position:");

     while (iteratorobj.hasNext()) {
         System.out.println(iteratorobj.next());
     }
 }
}
