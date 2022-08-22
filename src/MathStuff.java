import javax.swing.*;

public class MathStuff {

    public static void main() {

        double x = 3.14; // Setting a double to a decimal value
        double y = -10; // Setting a double to a negative value

        double z = Math.sqrt(x); // max or min, abs, sqrt, round, ceil, floor, etc.
        // Checking the square root of z

        // System.out.println(z); // Prints z to the console

        // Declaring 3 double variables.
        double a;
        double b;
        double c;

        a = Double.parseDouble(JOptionPane.showInputDialog("Enter side A")); // Getting user input for value A
        b = Double.parseDouble(JOptionPane.showInputDialog("Enter side B")); // Getting user input for value B

        z = Math.sqrt((a*a) + (b*b)); // Performing math to find out the square root of the sum of the squares of A and B

        JOptionPane.showMessageDialog(null, "The hypotenuse is " + z); // Using previous information to print the hypotenuse to the console


    }

}
