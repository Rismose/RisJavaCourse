import java.util.Scanner;

public class Input {

    public static void main() {

        Scanner input = new Scanner(System.in);

        System.out.println("What's your name?"); // string
        String name = input.nextLine();

        System.out.println("What's your password?"); // string
        String password = input.nextLine();

        System.out.println("What is your age?"); // int
        int age = input.nextInt();

        if (name.equals("Rismose") && password.equals("wasd") && age == 17) {
            System.out.println("Welcome to the club");
        } else {
            System.out.println("You're not welcome here");
        }

        }


}
