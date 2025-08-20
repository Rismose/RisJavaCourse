// SwapVariable.java
// Demonstrates how to swap the values of two variables using a temporary variable
// Try it yourself: Change the values of x and y, or swap numbers instead!

package Variable;

public class SwapVariable {

    public static void main(String[] args) {
        // Initial values
        String x = "x"; // First variable
        String y = "y"; // Second variable
        String temp;     // Temporary variable for swapping

        // Swapping process
        temp = x; // Store x in temp
        x = y;   // Assign y to x
        y = temp; // Assign temp (original x) to y

        System.out.println("x: " + x); // Prints the value of x (Which would be "y")
        System.out.println("y: " + y); // Prints the value of y (Which would be "x")

        // Try it yourself:
        // - Change x and y to other strings or numbers.
        // - Swap numbers instead of strings.
        // - What happens if you skip the temp variable?
    }

}
