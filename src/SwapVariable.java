public class SwapVariable {

    public static void main() {

        String x = "x"; // Declare a string variable
        String y = "y"; // Declare a string variable
        String temp; // Declare a string variable

        temp = x; // Assign x to temp

        x = y; // Assign y to x

        y = temp; // Assign temp to y

        System.out.println("x: " + x); // Prints the value of x
        System.out.println("y: " + y); // Prints the value of y

    }

}
