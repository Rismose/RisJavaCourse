package Methods;

public class Methods {

    public static void main() {

        hello_world(); // Call the method hello_world(). This will print out "Hello World!".


        String title = "Hello"; // Declare a string variable
        int thing = 5; // Declare an integer variable
        print(title, thing); // Call the method print(). This will print out "Hello World!".

    }

    private static void hello_world() { // Private method outside the main method that prints "Hello World"
        System.out.println("Hello World!");
    }

    private static void print(String message, int number) { // Private method outside the main method that prints a message
        System.out.println(message + " " + number);
    }

}
