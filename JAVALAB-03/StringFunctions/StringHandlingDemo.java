package StringFunctions;

//3a. Develop a java program for performing various string operations
//with different string handling functions.


public class StringHandlingDemo {

 public static void main(String[] args) {

     // String Creation and Basic Operations
     System.out.println("=== String Creation and Basic Operations ===");

     String str1 = "Hello, World!";
     String str2 = new String("Java Programming");

     System.out.println("str1: " + str1);
     System.out.println("str2: " + str2);


     // Length and Character Access
     System.out.println("\n=== Length and Character Access ===");

     System.out.println("Length of str1: " + str1.length());
     System.out.println("Character at index 4: " + str1.charAt(4));


     // String Comparison
     System.out.println("\n=== String Comparison ===");

     String str3 = "hello, world!";

     System.out.println("Equals: " + str1.equals(str3));
     System.out.println("Equals Ignore Case: "
             + str1.equalsIgnoreCase(str3));
     System.out.println("CompareTo: "
             + str1.compareTo(str3));


     // String Searching
     System.out.println("\n=== String Searching ===");

     System.out.println("Index of World: "
             + str1.indexOf("World"));

     System.out.println("Last index of o: "
             + str1.lastIndexOf('o'));

     System.out.println("Contains Hello: "
             + str1.contains("Hello"));


     // Substring Operations
     System.out.println("\n=== Substring Operations ===");

     System.out.println("Substring(7): "
             + str1.substring(7));

     System.out.println("Substring(0,5): "
             + str1.substring(0, 5));


     // String Modification
     System.out.println("\n=== String Modification ===");

     System.out.println("Uppercase: "
             + str1.toUpperCase());

     System.out.println("Lowercase: "
             + str1.toLowerCase());

     System.out.println("Replace World with Java: "
             + str1.replace("World", "Java"));


     // Whitespace Handling
     System.out.println("\n=== Whitespace Handling ===");

     String spaced = "   Trimming Example   ";

     System.out.println("Original: '" + spaced + "'");
     System.out.println("Trimmed: '" + spaced.trim() + "'");


     // String Concatenation
     System.out.println("\n=== String Concatenation ===");

     String a = "Hello";
     String b = "World";

     System.out.println("Using + : " + a + " " + b);
     System.out.println("Using concat(): "
             + a.concat(" ").concat(b));


     // String Splitting
     System.out.println("\n=== String Splitting ===");

     String csv = "Java,Python,C++,JavaScript";

     String[] lang = csv.split(",");

     for (int i = 0; i < lang.length; i++) {
         System.out.println("Language "
                 + (i + 1) + ": "
                 + lang[i]);
     }


     // StringBuilder Demo
     System.out.println("\n=== StringBuilder Demo ===");

     StringBuilder builder = new StringBuilder();

     builder.append("Learning ");
     builder.append("Java ");
     builder.append("Programming");

     System.out.println(builder);

     builder.insert(9, "Core ");
     System.out.println("After insert: " + builder);

     builder.reverse();
     System.out.println("After reverse: " + builder);


     // String Formatting
     System.out.println("\n=== String Formatting ===");

     String formatted =
             String.format(
                     "Name: %s, Age: %d, Height: %.2f",
                     "John", 25, 1.75);

     System.out.println(formatted);


     // Validate Email
     System.out.println("\n=== Email Validation ===");

     String email = "user@example.com";

     System.out.println("Email: " + email);
     System.out.println("Valid: "
             + validateEmail(email));
 }


 // Helper method
 public static boolean validateEmail(String email) {

     return email != null &&
            email.contains("@") &&
            email.contains(".") &&
            email.startsWith("user") &&
            email.endsWith(".com");
 }
}
