package Swings;

//6c. Develop a Swing program in Java to add countries into JList
//and display the capital of selected country on console.


import java.util.HashMap;
import javax.swing.*;
import javax.swing.event.*;

public class CountryCapitalList extends JFrame {

 JList<String> countryList;
 HashMap<String, String> capitalMap;

 CountryCapitalList() {

     DefaultListModel<String> model =
             new DefaultListModel<>();

     model.addElement("USA");
     model.addElement("India");
     model.addElement("Vietnam");
     model.addElement("Canada");
     model.addElement("Denmark");
     model.addElement("France");
     model.addElement("Great Britain");
     model.addElement("Japan");
     model.addElement("Africa");
     model.addElement("Greenland");
     model.addElement("Singapore");

     capitalMap =
             new HashMap<>();

     capitalMap.put("USA",
             "Washington D.C.");
     capitalMap.put("India",
             "New Delhi");
     capitalMap.put("Vietnam",
             "Hanoi");
     capitalMap.put("Canada",
             "Ottawa");
     capitalMap.put("Denmark",
             "Copenhagen");
     capitalMap.put("France",
             "Paris");
     capitalMap.put("Great Britain",
             "London");
     capitalMap.put("Japan",
             "Tokyo");
     capitalMap.put("Africa",
             "Addis Ababa");
     capitalMap.put("Greenland",
             "Nuuk");
     capitalMap.put("Singapore",
             "Singapore");

     countryList =
             new JList<>(model);

     countryList.addListSelectionListener(
         new ListSelectionListener() {

         public void valueChanged(
                 ListSelectionEvent e) {

             if (!e.getValueIsAdjusting()) {

                 String country =
                     countryList
                     .getSelectedValue();

                 if (country != null) {

                     System.out.println(
                     "Capital of "
                     + country
                     + " is: "
                     + capitalMap
                     .get(country));
                 }
             }
         }
     });

     add(new JScrollPane(
             countryList));

     setTitle(
             "Country Capitals");

     setSize(250, 300);

     setLocationRelativeTo(
             null);

     setVisible(true);

     setDefaultCloseOperation(
             JFrame.EXIT_ON_CLOSE);
 }

 public static void main(
         String[] args) {

     new CountryCapitalList();
 }
}