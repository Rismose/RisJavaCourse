import java.util.Scanner;

public class WhileLoops {

    public static void main() {

        // whileLoop(); = executes while the condition is true
        // as long as the input is nothing, the loop will continue to ask for your name

        Scanner input = new Scanner(System.in);
        String name = "";

        /* do{
            System.out.println("Enter your name: ");
            name = input.nextLine();
        }while (name.equals(""));
         */

        while (name.equals("")) {
            System.out.println("Enter your name: ");
            name = input.nextLine();
        }

        System.out.println("Hello " + name + "!");

    }

}
