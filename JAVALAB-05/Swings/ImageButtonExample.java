package Swings;

//1. Develop a Swing program in Java to display a message
//"Digital Clock is pressed" or "Hour Glass is pressed"
//depending upon the JButton with image pressed
//using addActionListener().

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ImageButtonExample {

 JLabel label;

 ImageButtonExample() {

     JFrame f = new JFrame("Button Image Demo");

     f.setSize(1000, 450);
     f.setLayout(null);
     f.getContentPane().setBackground(Color.LIGHT_GRAY);

     label = new JLabel("");
     label.setBounds(30, 40, 700, 40);
     label.setFont(new Font("Arial", Font.BOLD, 28));

     ImageIcon icon1 =
         new ImageIcon(getClass()
         .getResource("clock.png"));

     ImageIcon icon2 =
         new ImageIcon(getClass()
         .getResource("hourglass.png"));

     Image img1 =
         icon1.getImage()
         .getScaledInstance(
         150, 150,
         Image.SCALE_SMOOTH);

     Image img2 =
         icon2.getImage()
         .getScaledInstance(
         150, 150,
         Image.SCALE_SMOOTH);

     JButton b1 =
         new JButton(
         new ImageIcon(img1));

     JButton b2 =
         new JButton(
         new ImageIcon(img2));

     b1.setBounds(
         180, 170, 150, 150);

     b2.setBounds(
         720, 170, 150, 150);

     b1.addActionListener(
         new ActionListener() {

         public void actionPerformed(
                 ActionEvent e) {

             label.setText(
             "You have pressed digital clock!");
         }
     });

     b2.addActionListener(
         new ActionListener() {

         public void actionPerformed(
                 ActionEvent e) {

             label.setText(
             "You have pressed hour glass!");
         }
     });

     f.add(label);
     f.add(b1);
     f.add(b2);

     f.setVisible(true);

     f.setDefaultCloseOperation(
         JFrame.EXIT_ON_CLOSE);
 }

 public static void main(String[] args) {

     new ImageButtonExample();
 }
}