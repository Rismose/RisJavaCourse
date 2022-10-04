package Array;

public class Arrays {

    public static void main() {

     // Array = Store multiple values in a single variable.

     String[] chars = new String[3]; // Declare an array of strings named "chars" and set it to 3 elements

     chars[0] = "a"; // Set the first element of the array to "a"
     chars[1] = "b"; // Set the second element of the array to "b"
     chars[2] = "c"; // Set the third element of the array to "c"

     try {
         for (int i=0; i<chars.length; i++) { // For loop that will loop through the array until it reaches the end
             System.out.println(chars[i]); // Prints the element of the array. You could also just print whatever one you want,
         }                                 // but the for loop can be used to loop through the array and print each element
     } catch (Exception e) { // Catch any exceptions
         System.out.println("The requested string is out of bounds."); // Prints the message if the input is invalid
     }



    }
}
