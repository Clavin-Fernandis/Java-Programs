package LinkedList;

//4. Write a Java program to display elements and their positions
//in a linked list using get(p).

import java.util.*;

public class p9 {
 public static void main(String[] args) {

     LinkedList<String> list = new LinkedList<>();

     list.add("Red");
     list.add("Blue");
     list.add("Green");
     list.add("Yellow");

     System.out.println("Linked List: " + list);

     for (int p = 0; p < list.size(); p++) {
         System.out.println("Position " + (p + 1) + " : " + list.get(p));
     }
 }
}