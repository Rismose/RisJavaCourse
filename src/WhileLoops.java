import java.util.Scanner;

public class WhileLoops {

    public static void main() {

        // whileLoop(); = executes while the condition is true
        // as long as the input is nothing, the loop will continue to ask for your name

        Scanner input = new Scanner(System.in); // Declare a Scanner object
        String name = ""; // Declare an empty string variable. This will be used to store the user's name

        // DO LOOP
        do{ // Do while loop that will execute while the condition is true
            System.out.println("Enter your name: "); // Printing a message to the console asking for your name
            name = input.nextLine(); // Storing your input in a string named "name"
        }while (name.equals("")); // Condition that will check if the input is nothing

        // WHILE LOOP
        while (name.equals("")) { // While loop that will execute while the condition is true
            System.out.println("Enter your name: "); // Printing a message to the console asking for your name
            name = input.nextLine(); // Storing your input in a string named "name"
        }

        System.out.println("Hello " + name + "!"); // Prints the message with the user's name
        input.close(); // Closes the Scanner object
    }

}
