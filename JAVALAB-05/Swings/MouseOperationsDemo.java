package Swings;

//Develop a simple swing program for illustrating mouse operations
//such as mouse down, mouse up, double click,
//single click with help of a button.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseOperationsDemo {

 JLabel label;
 JButton button;

 MouseOperationsDemo() {

     JFrame f =
         new JFrame(
         "Mouse Operations");

     f.setSize(600, 400);
     f.setLayout(null);

     label =
         new JLabel("");

     label.setBounds(
         100, 50, 400, 40);

     label.setFont(
         new Font(
         "Arial",
         Font.BOLD,
         24));

     button =
         new JButton(
         "Click Me");

     button.setBounds(
         220, 180, 140, 60);

     button.addMouseListener(
         new MouseAdapter() {

         public void mousePressed(
                 MouseEvent e) {

             label.setText(
             "Mouse Down");
         }

         public void mouseReleased(
                 MouseEvent e) {

             label.setText(
             "Mouse Up");
         }

         public void mouseClicked(
                 MouseEvent e) {

             if (e.getClickCount() == 2) {

                 label.setText(
                 "Double Click");

             } else if
                 (e.getClickCount() == 1) {

                 label.setText(
                 "Single Click");
             }
         }
     });

     f.add(label);
     f.add(button);

     f.setVisible(true);

     f.setDefaultCloseOperation(
         JFrame.EXIT_ON_CLOSE);
 }

 public static void main(
         String[] args) {

     new MouseOperationsDemo();
 }
}
