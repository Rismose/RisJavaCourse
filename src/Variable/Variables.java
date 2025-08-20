// Variables.java
// Demonstrates how to declare and use variables in Java
// Try it yourself: Change the values and see what happens!

package Variable;

public class Variables {

    public static void main(String[] args) {
        // --- FLOAT EXAMPLE ---
        // This is the correct way to get a decimal result
        float x, y, z; // Declare 3 float variables
        x = 10f; // Assign 10 to x
        y = 20f; // Assign 20 to y
        z = x / y + 13f; // Divide x by y, add 13, assign to z

        System.out.println("The correct way of doing things"); // Prints a message
        System.out.println("z = " + z); // Shows the result
        System.out.println("X / Y = " + x / y + "\n"); // Shows division result

        // Why is this correct? Floats can store decimals, so x/y = 0.5

        // --- INT EXAMPLE ---
        // This is the incorrect way if you want decimals
        int a, b, c; // Declare 3 int variables
        a = 10; // Assign 10 to a
        b = 20; // Assign 20 to b
        c = a / b + 13; // Divide a by b, add 13, assign to c

        System.out.println("The incorrect way of doing things"); // Prints a message
        System.out.println("c = " + c); // Shows the result
        System.out.println("A / B = " + a / b); // Shows division result

        // Why is this incorrect? Ints can't store decimals, so a/b = 0

        // Try it yourself:
        // - Change the values of x, y, a, b and see what prints!
        // - Try using double instead of float or int.
    }
}
