// NestedLoops.java
// Demonstrates nested loops in Java by drawing a grid of symbols
// Try it yourself: Change the symbol, grid size, or print numbers instead!

package Loops;

import java.util.Scanner;

public class NestedLoops {

    public static void main(String[] args) {
        // --- NESTED LOOPS ---
        // A loop inside another loop
        nest(); // Start the grid drawing method
    }

    // Method for drawing the grid
    public static void nest() {
        Scanner input = new Scanner(System.in); // Scanner for user input
        int rows = 0; // Number of rows in the grid
        int columns = 0; // Number of columns in the grid
        char symbol = '*'; // Default symbol to print in the grid

        try { // Try to read the number of rows
            System.out.println("Enter # of rows: "); // Prompt user for number of rows by printing a message
            rows = input.nextInt();  // Read the number of rows from user input
        } catch (Exception e) { // Catch any exception that occurs during input
            // If input is not a valid integer, print an error message and restart the method
            System.out.println("Invalid input. Please enter a number."); // Print an error message
            input.nextLine(); // Clear the invalid input from the scanner
            System.out.println("Restarting..."); // Indicate that the method will restart
            nest(); // Call the method again to restart the input process
            input.close(); // Close the scanner to avoid resource leaks
            System.out.println("Scanner closed."); // Print a message indicating the scanner is closed
            System.out.println("Exiting..."); // Print a message indicating the method is exiting
            return; // Exit the method to prevent further execution
        }

        try { // Try to read the number of columns
            System.out.println("Enter # of columns: "); // Print a message to ask for the number of columns
            columns = input.nextInt(); // Read the number of columns from user input
        } catch (Exception e) { // Catch any exception that occurs during input
            // If input is not a valid integer, print an error message and restart the method
            System.out.println("Invalid input. Please enter a number."); // Print an error message
            input.nextLine(); // Clear the invalid input from the scanner
            System.out.println("Restarting..."); // Indicate that the method will restart
            nest(); // Call the method again to restart the input process
            input.close(); // Close the scanner to avoid resource leaks
            System.out.println("Scanner closed."); // Print a message indicating the scanner is closed
            System.out.println("Exiting..."); // Print a message indicating the method is exiting
            // Call the method again to restart the input process
            return; // Exit the method to prevent further execution
        }

        System.out.println("Enter symbol: "); // Prompt user for the symbol to print in the grid
        // Read the symbol from user input
        // next() reads the next token (word) from the input, and charAt(0) gets the first character of that token
        // This allows the user to enter a single character as the symbol
        // If the user enters more than one character, only the first character will be used
        // For example, if the user types "hello", only 'h' will be used as the symbol
        // If the user types a space, it will use a space as the symbol
        // If the user types a special character, that character will be used
        symbol = input.next().charAt(0); // Read the first character of the next token as the symbol

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) { // Loop through each row
            System.out.println(); // New line for each row
            // Inner loop for columns
            for (int j = 1; j <= columns; j++) { // Loop through each column
                // Print the symbol for each column in the current row
                // This will create a grid of symbols based on the number of rows and columns specified by
                System.out.print(symbol); // Print the symbol
            }
        }
        System.out.println(); // End with a new line
        input.close(); // Close the scanner to free up resources
        System.out.println("Scanner closed."); // Print a message indicating the scanner is closed
        System.out.println("Exiting..."); // Print a message indicating the method is exiting
        nest();

        // Try it yourself:
        // - Change the symbol to something else.
        // - Print numbers instead of symbols.
        // - Try different grid sizes.
        // - What happens if you enter 0 for rows or columns?
    }
}
