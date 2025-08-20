// OverloadedMethods.java
// Demonstrates method overloading in Java
// Try it yourself: Add more overloaded methods, change parameters, or use other types!

package Methods;

public class OverloadedMethods {
    public static void main(String[] args) {
        int x = add(1,2,3,4); // Calls the method with 4 parameters
        int x2 = add(1,2,3);  // Calls the method with 3 parameters
        int x3 = add(1,2);    // Calls the method with 2 parameters

        // Try commenting out lines above to see which method is called!
        // Try it yourself:
        // - Add another overloaded method (e.g., 5 parameters).
        // - Change the parameter types (e.g., double).
        // - Print the results of x, x2, x3.
    }

    // Method with 2 parameters
    static int add(int x, int y) { // This method is overloaded
        System.out.println("This is overloaded method 1"); // Prints which method is called to the console
        return x + y; // Returns the sum of x and y
    }

    // Method with 3 parameters
    static int add(int x, int y, int z) { // This method is overloaded
        System.out.println("This is overloaded method 2"); // Prints which method is called to the console
        return x + y + z; // Returns the sum of x, y, and z
    }

    // Method with 4 parameters
    static int add(int x, int y, int z, int a) { // This method is overloaded
        System.out.println("This is overloaded method 3"); // Prints which method is called to the console
        return x + y + z + a; // Returns the sum of x, y, z, and a
    }
}
