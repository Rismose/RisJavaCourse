package Methods;

public class OverloadedMethods {

    public static void main() { // Initial Method

        int x = add(1,2,3,4); // Call the method with 4 parameters
        int x2 = add(1,2,3); // Call the method with 3 parameters
        int x3 = add(1,2); // Call the method with 2 parameters

        // If you want you can try and comment out any of the above lines and see what happens.
        // if you leave x uncommented it will use the method with 4 parameters.
        // if you leave x2 uncommented it will use the method with 3 parameters.
        // if you leave x3 uncommented it will use the method with 2 parameters.

    }

    static int add(int x, int y) { // Method with 2 parameters
        System.out.println("This is overloaded method 1"); // This will print if you call the method with 2 parameters
        return x + y; // Return the sum of x and y
    }

    static int add(int x, int y, int z) { // Method with 3 parameters
        System.out.println("This is overloaded method 2"); // This will print if you call the method with 3 parameters
        return x + y + z; // Return the sum of x, y and z
    }

    static int add(int x, int y, int z, int a) { // Method with 4 parameters
        System.out.println("This is overloaded method 3"); // This will print if you call the method with 4 parameters
        return x + y + z + a; // Return the sum of x, y, z and a
    }

}
