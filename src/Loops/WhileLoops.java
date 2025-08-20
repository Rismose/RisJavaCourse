// WhileLoops.java
// Demonstrates do-while and while loops in Java
// Try it yourself: Change the condition, ask for different input, or count numbers!

package Loops;

import java.util.Scanner;

public class WhileLoops {

    public static void main(String[] args) {
        // --- DO-WHILE LOOP ---
        // Executes at least once, then repeats while the condition is true
        Scanner input = new Scanner(System.in); // Scanner for user input
        String name = ""; // Initialize name variable to an empty string
        do { // This block will run at least once
            System.out.println("Enter your name: "); // Asks the user to enter their name
            // The do-while loop will execute this block at least once
            // It will then check the condition after executing the block
            // If the condition is true, it will repeat the block
            // If the condition is false, it will exit the loop
            name = input.nextLine(); // Reads the user's input and stores it in the name variable
        } while (name.equals("")); // Keeps asking until you type something

        // --- WHILE LOOP ---
        // Repeats while the condition is true
        while (name.equals("")) { // This loop will run as long as name is an empty string
            // This loop will keep asking for input until the user enters a non-empty name
            // It checks the condition before executing the block
            // If the condition is true, it will execute the block
            // If the condition is false, it will exit the loop
            System.out.println("Enter your name: "); // Asks the user to enter their name again
            name = input.nextLine(); // Reads the user's input and updates the name variable
        }

        System.out.println("Hello " + name + "!"); // Prints a greeting with the entered name
        input.close(); // Closes the Scanner to free up resources

        // Try it yourself:
        // - Change the condition to something else (e.g., ask for a number > 10)
        // - Use a counter to print numbers from 1 to 5
        // - What happens if you enter only spaces?
    }
}
