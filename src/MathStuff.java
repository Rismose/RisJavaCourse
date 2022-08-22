import javax.swing.*;

public class MathStuff {

    public static void main() {

        double x = 3.14;
        double y = -10;

        double z = Math.sqrt(x); // max or min, abs, sqrt, round, ceil, floor, etc.

        // System.out.println(z);

        double a;
        double b;
        double c;

        a = Double.parseDouble(JOptionPane.showInputDialog("Enter side A"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Enter side B"));

        z = Math.sqrt((a*a) + (b*b));

        JOptionPane.showMessageDialog(null, "The hypotenuse is " + z);


    }

}
