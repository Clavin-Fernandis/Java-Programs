package Swings;

//6b. Develop a Swing program in Java to create a Tabbed Pane
//of RED, BLUE and GREEN and display the concerned color
//whenever the specific tab is selected.



import java.awt.Color;
import javax.swing.*;

public class TabbedPaneExample {

 JFrame f;

 TabbedPaneExample() {

     f = new JFrame(
             "Tabbed Pane Example");

     JPanel p1 =
             new JPanel();

     JPanel p2 =
             new JPanel();

     JPanel p3 =
             new JPanel();

     p1.setBackground(
             Color.RED);

     p2.setBackground(
             Color.BLUE);

     p3.setBackground(
             Color.GREEN);

     JTabbedPane tp =
             new JTabbedPane();

     tp.setBounds(
             50, 50, 300, 250);

     tp.add("RED", p1);
     tp.add("BLUE", p2);
     tp.add("GREEN", p3);

     f.add(tp);

     f.setSize(450, 400);

     f.setLayout(null);

     f.setVisible(true);

     f.setDefaultCloseOperation(
             JFrame.EXIT_ON_CLOSE);
 }

 public static void main(
         String[] args) {

     new TabbedPaneExample();
 }
}