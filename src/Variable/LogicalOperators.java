// LogicalOperators.java
// Demonstrates logical operators in Java: && (and), || (or), ! (not)
// Try it yourself: Change the temperature, try different phrases, or add your own conditions!

package Variable;

import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {
        // --- AND operator (&&) ---
        int temp = 25; // Try changing this value!
        if (temp > 30) { // If temperature is greater than 30
            System.out.println("It is hot outside"); // Prints if variable temp is greater than 30
        } else if (temp > 20 && temp < 30) { // If temperature is between 20 and 30
            System.out.println("It is nice outside"); // Prints if variable temp is greater than 20 and less than 30
        } else { // If temperature is 20 or less
            System.out.println("It is cold outside"); // Prints if variable temp is 20 or less
        }

        // --- NOT operator (!) ---
        not();  // See method below
        not2(); // See method below

        // --- OR operator (||) ---
        game(); // See method below

        // Try it yourself:
        // - Change the value of temp and see what prints!
        // - Add more conditions using &&, ||, or !

        // The && operator checks if both conditions are true,
        // the || operator checks if at least one condition is true,
        // and the ! operator negates a condition (makes it false).

        // - Try different phrases in the not() and game() methods.
    }

    // Method to showcase the NOT operator (!)
    // Keeps asking until you type the correct phrase
    private static void not() {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input
        System.out.println("Type \"yes\""); // Prompt the user to type "yes"
        if ("yes".equals(input.next())) { // Check if the input is "yes"
            System.out.println("You typed \"yes\""); // If the input is "yes", print a message
        } else { // If the input is not "yes"
            System.out.println("You did not type \"yes\". Try again!"); // Print a message indicating the input was incorrect
            not(); // Recursively call itself until "yes" is typed since it's in the else block
            // This will keep asking the user to type "yes" until they do so.
            // Note: This is a simple example and can lead to infinite recursion if not handled properly
        }
    }

    // Another NOT example
    private static void not2() {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input
        System.out.println("Type anything except \"no\""); // Prompt the user to type anything except "no"
        String answer = input.next(); // Read the user's input
        if (!"no".equals(answer)) { // Check if the input is not "no"
            System.out.println("You did not type \"no\"!"); // If the input is not "no", print a message
        } else { // If the input is "no"
            System.out.println("You typed \"no\". Try again!"); // Print a message indicating the input was "no"
            not2(); // Recursively call itself until the input is not "no" since it's in the else block
            // This will keep asking the user to type anything except "no" until they do so
            // Note: This is a simple example and can lead to infinite recursion if not handled properly
        }
    }

    // OR operator example
    private static void game() {
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input
        System.out.println("Type \"win\" or \"lose\""); // Prompt the user to type either "win" or "lose"
        String answer = input.next(); // Read the user's input
        if ("win".equals(answer) || "lose".equals(answer)) { // Check if the input is either "win" or "lose"
            System.out.println("Game over!"); // If the input is either "win" or "lose", print a message
        } else { // If the input is neither "win" nor "lose"
            System.out.println("Invalid input. Try again!"); // Print a message indicating the input was invalid
            game(); // Recursively call itself until a valid input is typed since it's in the else block
            // This will keep asking the user to type either "win" or "lose" until they do so
            // Note: This is a simple example and can lead to infinite recursion if
        }
    }
}
