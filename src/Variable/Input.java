package Variable;

import java.util.Scanner;

public class Input {

    public static void main() {

        Scanner input = new Scanner(System.in); // Declare a Scanner object

        System.out.println("What's your name?"); // Printing a message to the console asking about your name
        String name = input.nextLine(); // Storing your answer in a string named "name"

        System.out.println("What's your password?"); // Printing a message to the console asking about your password
        String password = input.nextLine(); // Storing your answer in a string named "password"

        System.out.println("What is your age?"); // Printing a message to the console asking about your age
        int age = input.nextInt(); // Storing your answer in an integer named "age"

        input.close(); // Closing the scanner object

        if (name.equals("Rismose") && password.equals("wasd") && age == 17) { // Simple if statement with && operator checking if all the information is correct.
            System.out.println("Welcome to the club"); // Prints the welcome message if you are successfully "logged" in
        } else { // Else if the information is incorrect
            System.out.println("You're not welcome here"); // Prints the boot message if you are not successfully "logged" in
        }

    }


}
