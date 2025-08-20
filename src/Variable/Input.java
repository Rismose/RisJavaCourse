// Input.java
// Demonstrates how to get user input from the console using Scanner
// Try it yourself: Change the questions, add more input, or check for other values!

package Variable;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner for user input

        System.out.println("What's your name?"); // Prints a message to the console and asks for input
        String name = input.nextLine(); // Using a Scanner to read a line of text input and store it in a variable
        // Next line is used to read the entire line of input including spaces

        System.out.println("What's your password?"); // Prints a message to the console and asks for input
        String password = input.nextLine(); // Using a Scanner to read a line of text input for the password
        // Next line is used to read the entire line of input including spaces

        System.out.println("What is your age?"); // Prints a message to the console and asks for input
        int age = input.nextInt(); // Using a Scanner to read an integer input for age
        // nextInt() reads the next integer from the input
        // Note: If the user enters a non-integer value, it will throw an InputMismatchException
        // You might want to handle this with a try-catch block in a real application

        input.close(); // Close the Scanner to free up resources

        // Check if all information matches
        if (name.equals("Rismose") && password.equals("wasd") && age == 20) { // Check if name is "Rismose", password is "wasd", and age is 20
            System.out.println("Welcome to the club"); // If all conditions are true, print a welcome message
        } else { // If any condition is false
            // If the name is not "Rismose", password is not "wasd", or age is not 20
            System.out.println("You're not welcome here"); // Print a message indicating the user is not welcome
        }

        // Try it yourself:
        // - Change the questions or add more input fields.
        // - Try different values for name, password, and age.
        // - What happens if you enter a non-number for age?
    }
}
