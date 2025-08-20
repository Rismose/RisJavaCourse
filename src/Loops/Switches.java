// Switches.java
// Demonstrates the use of switch statements in Java
// Try it yourself: Change the variable, add more cases, or use numbers!

package Loops;

public class Switches {
    // Switch = statement that allows a variable to be tested against multiple values
    public static void main(String[] args) {
        String day = "Pizza"; // Try changing this to a day of the week or something else!

        switch(day) { // Switch statement to check the value of 'day'
            case "Sunday": // Each case checks if 'day' matches a specific value (e.g., "Sunday")
                System.out.println("It is Sunday"); // Prints a message if 'day' is "Sunday"
                break; // 'break' exits the switch statement after executing the matched case
            case "Monday": // If 'day' is "Monday", this case will execute
                System.out.println("It is Monday"); // Prints a message if 'day' is "Monday"
                break; // 'break' exits the switch statement after executing this case
            case "Tuesday": // If 'day' is "Tuesday", this case will execute
                System.out.println("It is Tuesday"); // Prints a message if 'day' is "Tuesday"
                break; // 'break' exits the switch statement after executing this case
            case "Wednesday": // If 'day' is "Wednesday", this case will execute
                System.out.println("It is Wednesday"); // Prints a message if 'day' is "Wednesday"
                break; // 'break' exits the switch statement after executing this case
            case "Thursday": // If 'day' is "Thursday", this case will execute
                System.out.println("It is Thursday"); // Prints a message if 'day' is "Thursday"
                break; // 'break' exits the switch statement after executing this case
            case "Friday": // If 'day' is "Friday", this case will execute
                System.out.println("It is Friday"); // Prints a message if 'day' is "Friday"
                break; // 'break' exits the switch statement after executing this case
            case "Saturday": // If 'day' is "Saturday", this case will execute
                System.out.println("It is Saturday"); // Prints a message if 'day' is "Saturday"
                break; // 'break' exits the switch statement after executing this case
            default: // If 'day' does not match any of the above cases, this default case will execute
                System.out.println(day + " is not a day"); // Prints a message if 'day' is not one of the specified days
                break; // 'break' here is optional since it's the last case, but it's good practice to include it
        }

        // Try it yourself:
        // - Change 'day' to different values and see what prints!
        // - Add more cases (e.g., holidays, special events).
        // - Use switch with numbers instead of strings.
    }
}
