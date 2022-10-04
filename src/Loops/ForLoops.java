package Loops;

public class ForLoops {

    public static void main() throws InterruptedException {

        // for loop = executes a certain number of times
        // this will count to 10 in the console, with one number per line while waiting for 500 milliseconds between each line

        // This will loop 11 times. The first time, i = 0, the second time, i = 1, etc. all the way to i = 10.
        for (int i = 0; i <= 10; i++) {
            Thread.sleep(500);
            System.out.println(i);
        }

    }

}
