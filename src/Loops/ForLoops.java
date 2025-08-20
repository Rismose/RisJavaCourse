// ForLoops.java
// Demonstrates a basic for loop in Java
// Try it yourself: Change the range, print something else, or change the delay!

package Loops;

public class ForLoops {

    public static void main(String[] args) throws InterruptedException {
        // --- FOR LOOP ---
        // Repeats a block of code a set number of times
        // This loop counts from 1 to 10, printing each number with a delay
        for (int i = 1; i <= 10; i++) { // Initializes i to 0, checks if "i" is less than or equal to 10, increments "i" by 1 each time
            // The loop will run 10 times (1 to 10 inclusive)
            Thread.sleep(500); // Waits 500 milliseconds between prints
            // Thread sleep sleeps the program for a specified time (in milliseconds)
            // This is useful for creating delays in output, like animations or timed events
            System.out.println(i); // Prints the current value of "i"
        }

        // Try it yourself:
        // - Change the range (e.g., count to 20 or start at 5)
        // - Print something else (e.g., i * 2)
        // - Change the delay or remove it
    }

}
