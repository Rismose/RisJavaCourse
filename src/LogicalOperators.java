import java.util.Scanner;

public class LogicalOperators {

    public static void main() {

        // logical operators: &&, ||, !
        //
        //                    && = and
        //                    ! = not
        //                    || = or


        //      AND operator (&&)
        int temp = 25; // Creating a temperature variable and assigning it a value

        if (temp>30) { // Simple If-statement checking if the temperature is above 30.

            System.out.println("It is hot outside"); // Prints the message if the temperature is above 30.

        } else if (temp>20 && temp<30) { // Checking whether the temperature is above 20 and below 30

            System.out.println("It is nice outside"); // Prints the message if the temperature is above 20 and below 30.

        } else { // Else if the temperature is below 20

            System.out.println("It is cold outside"); // Prints the message if the temperature is below 20.
        }


        //      NOT operator (!)
       not();      // Check the method below called not()
       not2();     // Check the method below called not2()

        //      OR operator (||)
       game();     // Check the method below called game()

    }

    //      A method to showcase the NOT operator (!)
    //      While being able to restart itself if you do not type the correct phrase

    private static void not() {
        Scanner input = new Scanner(System.in); // Declaring a Scanner object

        System.out.println("Type \"yes\""); // Printing a message asking you to say "yes"
        if ("yes".equals(input.next())) { // Simple if-statement & scanner input checking if the answer is "yes".
            System.out.println("You typed \"yes\""); // Prints the message if the answer is "yes".
        } else { // Else if the answer wasn't "yes"
            System.out.println("You did not type \"yes\""); // Prints the message if the answer wasn't "yes".
            input.close(); // Closing the scanner object
            not(); // Restarting the method
        }
    }

    //      A method to showcase the NOT operator (!)
    //      While being able to restart itself if you do not type the correct phrase
    //      Works the same as not() but uses switches instead of if-statements

    private static void not2() {
        Scanner input = new Scanner(System.in); // Declaring a Scanner object

        System.out.println("Type \"yes\""); // Printing a message asking you to say "yes"
        switch (input.next()) { // Switch statement checking if the answer is "yes".
            case "yes": // If the answer is "yes"
                System.out.println("You typed \"yes\""); // Prints the message if the answer is "yes".
                break;  // Breaking the switch.
            default: // Else if the answer wasn't "yes". Default switch will deny.
                System.out.println("You did not type \"yes\""); // Prints the message if the answer wasn't "yes".
                not2(); // Restarting the method
                input.close(); // Closing the scanner object
                break; // Breaking the switch.
        }
    }

    //      A method to showcase the OR operator (||)
    //      While being able to restart itself if you do not press the correct key
    private static void game() {
        Scanner input = new Scanner(System.in); // Declaring a Scanner object

        System.out.println("You are in the Lost Forest, press q or Q to quit"); // Printing a message asking you to press "q" or "Q"
        String response = input.next(); // Storing the input in a string named "response"

        if (response.equals("q") || response.equals("Q")) { // Simple if-statement checking if the answer is "q" or "Q".
            System.out.println("You have escaped the Lost Forest"); // Prints the message if the answer is "q" or "Q".
        } else { // Else if the answer wasn't "q" or "Q"
            System.out.println("You did not escape."); // Prints the message if the answer wasn't "q" or "Q".
            input.close(); // Closing the scanner object
            game(); // Restarting the method
        }
    }

}
