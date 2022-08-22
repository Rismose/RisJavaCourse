import java.util.Scanner;

public class NestedLoops {

    public static void main() {

     // nested loops = a loop inside a loop

        nest();

    }

    //      Main nest method for drawing the grid
    public static void nest() {

        Scanner input = new Scanner(System.in);
        int rows;
        int colums;
        char symbol = '*';

        /*
        System.out.println("Enter # of rows: ");
        rows = input.nextInt();
        */

        try {
            System.out.println("Enter # of rows: ");
            rows = input.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
            return;
        }

        try {
            System.out.println("Enter # of columns: ");
            colums = input.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a number.");
            return;
        }

        /*
        System.out.println("Enter # of columns: ");
        colums = input.nextInt();
         */

        System.out.println("Enter symbol: ");
        symbol = input.next().charAt(0);

        for (int i = 1; i <= rows; i++) {
            System.out.println();
            for (int j = 1; j <= colums; j++) {
                System.out.print(symbol);
            }
        }

        again();

    }

    //     Method for asking if the user wants to draw another grid

    public static void again() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("Would you like to do another? (y/n)");
        String answer = input.next();
        switch (answer) {
            case "y":
                nest();
                break;
            case "n":
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid input");
                break;
            }
        }
}
