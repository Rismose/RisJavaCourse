// Methods.java
// Demonstrates how to create and use methods in Java
// Try it yourself: Add more methods, change parameters, or return values!

package Methods;

public class Methods {
    public static void main(String[] args) {
        hello_world(); // Calls the hello_world method

        String title = "Hello"; // A string variable to hold a message
        int thing = 5; // An integer variable to hold a number
        print(title, thing); // Calls the print method with parameters

        // Try it yourself:
        // - Add a method that returns a value (e.g., int add(int a, int b)).
        // - Change the parameters and see what prints.
        // - Create a method that takes user input.
    }

    // Method that prints "Hello World!"
    private static void hello_world() {
        System.out.println("Hello World!"); // Prints a greeting message to the console
    }

    // Method that prints a message and a number
    private static void print(String message, int number) {
        System.out.println(message + " " + number); // Prints the message and the number passed as parameters
        // This method takes a string and an integer, then prints them together
        // Try changing the parameters when calling this method to see different outputs
    }
}
