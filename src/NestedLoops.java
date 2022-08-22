import java.util.Scanner;

public class NestedLoops {

    public static void main() {

     // nested loops = a loop inside a loop
        
        nest(); // Starting main method

    }

    //      Main nest method for drawing the grid
    public static void nest() {

        Scanner input = new Scanner(System.in); // Declare a Scanner object
        
        int rows; // Declare an integer variable named "rows"
        int columns; // Declare an integer variable named "columns"
        char symbol = '*'; // Declare a char variable named "symbol" and set it to '*'


        try {
            System.out.println("Enter # of rows: "); // Printing a message to the console asking about the number of rows
            rows = input.nextInt(); // Storing your input in an integer named "rows"
        } catch (Exception e) { // Catch any exceptions
            System.out.println("Invalid input. Please enter a number."); // Prints the message if the input is invalid
            return; // Return to the main method
        }

        try {
            System.out.println("Enter # of columns: "); // Printing a message to the console asking about the number of columns
            columns = input.nextInt(); // Storing your input in an integer named "columns"
        } catch (Exception e) { // Catch any exceptions
            System.out.println("Invalid input. Please enter a number."); // Prints the message if the input is invalid
            return; // Return to the main method
        }

        System.out.println("Enter symbol: "); // Printing a message to the console asking about the symbol
        symbol = input.next().charAt(0); // Storing your input in a char named "symbol"

        for (int i = 1; i <= rows; i++) { // For loop that will loop through the rows
            System.out.println(); // Prints a new line
            for (int j = 1; j <= columns; j++) { // For loop that will loop through the columns
                System.out.print(symbol); // Prints the symbol
            }
        }

        again(); // Starting the again() method that triggers the loop again if the user wants to
    }

    //     Method for asking if the user wants to draw another grid

    public static void again() {
        Scanner input = new Scanner(System.in); // Declare a Scanner object

        System.out.println("\n"); // Prints a new line
        System.out.println("Would you like to do another? (y/n)"); // Printing a message to the console asking if the user wants to do another grid
        String answer = input.next(); // Storing your input in a string named "answer"
        switch (answer) { // Switch statement that will check the input
            case "y": // If the input is "y"
                nest(); // Start the nest() method, the method that draws the grid
                break; // Break out of the switch statement
            case "n": // If the input is "n"
                System.out.println("Goodbye!"); // Prints the goodbye message
                break; // Break out of the switch statement
            default: // If the input is anything else
                System.out.println("Invalid input"); // Prints the invalid input message
                break; // Break out of the switch statement
            }
        }
}
