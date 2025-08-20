// Arrays.java
// Demonstrates how to use arrays in Java
// Try it yourself: Change the array size, add more elements, or use other types!

package Array;

public class Arrays {
    public static void main(String[] args) {
        // --- ARRAY BASICS ---
        // Arrays store multiple values in a single variable
        String[] chars = new String[3]; // Try changing the size!
        chars[0] = "a"; // Set the first element to "a"
        chars[1] = "b"; // Set the second element to "b"
        chars[2] = "c"; // Set the third element to "c"

        // Loop through the array and print each element
        try { // Attempt to access elements in the array
            for (int i = 0; i < chars.length; i++) { // Loop through each index of the array
                System.out.println(chars[i]); // Prints each element
            }
        } catch (Exception e) { // Catch any exceptions that occur (e.g., out of bounds)
            System.out.println("The requested string is out of bounds."); // Prints an error message if an exception occurs
        }

        // Try it yourself:
        // - Change the array size and add more elements.
        // - Use an int[] or double[] instead of String[].
        // - Print only certain elements (e.g., chars[1]).
    }
}
