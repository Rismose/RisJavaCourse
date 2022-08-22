import java.util.Scanner;

public class LogicalOperators {

    public static void main() {

        // logical operators: &&, ||, !
        //
        //                    && = and
        //                    ! = not
        //                    || = or


        //      AND operator (&&)
        int temp = 25;
        if (temp>30) {
            System.out.println("It is hot outside");
        } else if (temp>20 && temp<30) {
            System.out.println("It is nice outside");
        } else {
            System.out.println("It is cold outside");
        }


        //      NOT operator (!)
        not();      // Check the method below called not()
        not2();     // Check the method below called not2()

        //      OR operator (||)
        game();     // Check the method called game() below

    }

    //      A method to showcase the NOT operator (!)
    //      While being able to restart itself if you do not type the correct phrase

    private static void not() {
        Scanner input = new Scanner(System.in);

        System.out.println("Type \"yes\"");
        if ("yes".equals(input.next())) {
            System.out.println("You typed \"yes\"");
        } else {
            System.out.println("You did not type \"yes\"");
            not();
        }
    }

    //      A method to showcase the NOT operator (!)
    //      While being able to restart itself if you do not type the correct phrase
    //      Works the same as not() but uses switches instead of if-statements

    private static void not2() {
        Scanner input = new Scanner(System.in);

        System.out.println("Type \"yes\"");

        switch (input.next()) {
            case "yes":
                System.out.println("You typed \"yes\"");
                break;
            default:
                System.out.println("You did not type \"yes\"");
                not2();
                break;
        }
    }

    //      A method to showcase the OR operator (||)
    //      While being able to restart itself if you do not press the correct key
    private static void game() {
        Scanner input = new Scanner(System.in);

        System.out.println("You are in the Lost Forest, press q or Q to quit");
        String response = input.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You have escaped the Lost Forest");
        } else {
            System.out.println("You did not escape.");
            game();
        }
    }

}
