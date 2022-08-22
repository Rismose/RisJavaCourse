import java.util.Random;

public class RandomStuff {

    public static void main() {

        Random random = new Random(); // Declare a Random object

        int x = random.nextInt(5)+1; // works with booleans, doubles, floats, ints, longs, shorts too
        // Gets a random number between 1 and 5. 5 being the bound and 1 being the lower bound.

        System.out.println(x); // Prints the random number

    }

}
