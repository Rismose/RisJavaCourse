package Math;

import java.util.Random;

public class RandomStuff {

    public static void main(String[] args) {
        // Call the random function
        Random();
    }

    public static void Random() {
        // Create function random
            Random random = new Random(); // Declare a Random object
            int x = random.nextInt(5) + 1; // Gets a random number between 1 and 5 (+ 1 to avoid 0)
            System.out.println(x); // Prints the random number
        }
    }
