public class Variables {

    public static void main() {

        // This is the correct way of doing this and would give us an accurate result
        float x, y, z; // Declare 3 float variables

        x = 10f; // Assign 10 to x

        y = 20f; // Assign 20 to y

        z = x / y + 13f; // Perform math to find out the sum of x and y and add 13 to it. Then assign the result to z.

        System.out.println("The correct way of doing things"); // Prints the message to the console
        System.out.println("z = " + z); // Prints the value of z to the console
        System.out.println("X / Y = " + x / y + "\n"); // Prints the value of x divided by y to the console

        // The reason this is correct is that we are using float values to store the values, meaning we can get a decimal answer.
        // Which in this case is 0.5

        // Now to the INCORRECT way of doing things

        int a,b,c; // Declare 3 int variables

        a = 10; // Assign 10 to a

        b = 20; // Assign 20 to b

        c = a / b + 13; // Perform math to find out the sum of a and b and add 13 to it. Then assign the result to c.

        System.out.println("The incorrect way of doing things"); // Prints the message to the console
        System.out.println("c = " + c); // Prints the value of c to the console
        System.out.println("A / B = " + a / b); // Prints the value of a divided by b to the console

        // The reason this is incorrect is that we are using int values to store the values, meaning we can't get a decimal answer.
        // Which in this means we get 0 instead of 0.5
    }

}
