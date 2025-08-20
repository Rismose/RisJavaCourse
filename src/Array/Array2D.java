// Array2D.java
// Demonstrates how to use 2D arrays in Java
// Try it yourself: Change the size, values, or print in different formats!

package Array;

public class Array2D {
    public static void main(String[] args) {
        // --- 2D ARRAY BASICS ---
        // 2D arrays are arrays of arrays (like a grid or table)
        int[][] array2D = new int[3][3]; // Try changing the size!

        // Set values in the 2D array
        array2D[0][0] = 0; // First row, first column
        array2D[0][1] = 1; // First row, second column
        array2D[0][2] = 2; // First row, third column
        array2D[1][0] = 1; // Second row, first column
        array2D[1][1] = 2; // Second row, second column
        array2D[1][2] = 3; // Second row, third column
        array2D[2][0] = 1; // Third row, first column
        array2D[2][1] = 3; // Third row, second column
        array2D[2][2] = 3; // Third row, third column

        // Access and print specific values
        // We can also access specific elements in the 2D array using row and column indices
        System.out.println(array2D[1][1]); // Prints the value at row 1, column 1
        System.out.println("------------"); // Print a separator for better readability

        // Print out the entire 2D array as a grid
        for (int i = 0; i < array2D.length; i++) { // Loop through each row
            for (int j = 0; j < array2D[i].length; j++) { // Loop through each column in the current row
                System.out.print(array2D[i][j] + " "); // Print the value at row i, column j followed by a space
            }
            System.out.println(); // New line after each row
        }

        // Try it yourself:
        // - Change the size of the array (e.g., 4x4).
        // - Set different values and print them.
        // - Print the array in other formats (e.g., comma-separated).
    }
}
