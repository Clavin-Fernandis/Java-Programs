package string;

//4. Develop a Java program to make a Performance Test on StringBuffer and
//StringBuilder for appending the string 'AIET' for 10000 times both in
//the StringBuffer and StringBuilder. Justify which one is better.

public class PerformanceTest {

 public static void main(String[] args) {

     long startTime =
             System.currentTimeMillis();

     StringBuffer sb =
             new StringBuffer("Java");

     for (int i = 0; i < 10000; i++) {
         sb.append("AIET");
     }

     long bufferTime =
             System.currentTimeMillis()
             - startTime;

     System.out.println(
             "Time taken by StringBuffer: "
             + bufferTime + " ms");


     startTime =
             System.currentTimeMillis();

     StringBuilder sb2 =
             new StringBuilder("Java");

     for (int i = 0; i < 10000; i++) {
         sb2.append("AIET");
     }

     long builderTime =
             System.currentTimeMillis()
             - startTime;

     System.out.println(
             "Time taken by StringBuilder: "
             + builderTime + " ms");


     if (builderTime < bufferTime) {
         System.out.println(
             "StringBuilder is better because it is faster.");
     } else {
         System.out.println(
             "StringBuffer is better.");
     }
 }
}