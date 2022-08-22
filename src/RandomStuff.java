import java.util.Random;

public class RandomStuff {

    public static void main() {

        Random random = new Random();

        int x = random.nextInt(5)+1; // works with booleans, doubles, floats, ints, longs, shorts too

        System.out.println(x);

    }

}
