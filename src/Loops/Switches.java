package Loops;

public class Switches {

    // Switch = statement that allows a variable to be tested against multiple values

    public static void main() {

        String day = "Pizza"; // Declare a string variable

        switch(day) { // Switch statement that will check the value of the variable "day"
            case "Sunday": // If the value of "day" is "Sunday"
                System.out.println("It is Sunday"); // Prints the message
                break; // Breaks out of the switch statement

            case "Monday": // If the value of "day" is "Monday"
                System.out.println("It is Monday"); // Prints the message
                break; // Breaks out of the switch statement

            case "Tuesday": // If the value of "day" is "Tuesday"
                System.out.println("It is Tuesday"); // Prints the message
                break; // Breaks out of the switch statement

            case "Wednesday": // If the value of "day" is "Wednesday"
                System.out.println("It is Wednesday"); // Prints the message
                break; // Breaks out of the switch statement

            case "Thursday": // If the value of "day" is "Thursday"
                System.out.println("It is Thursday"); // Prints the message
                break; // Breaks out of the switch statement

            case "Friday": // If the value of "day" is "Friday"
                System.out.println("It is Friday"); // Prints the message
                break; // Breaks out of the switch statement

            case "Saturday": // If the value of "day" is "Saturday"
                System.out.println("It is Saturday"); // Prints the message
                break; // Breaks out of the switch statement

            default: // If the value of "day" is anything else
                System.out.println(day + " is not a day"); // Prints the message
                break; // Breaks out of the switch statement
        }

    }

}
