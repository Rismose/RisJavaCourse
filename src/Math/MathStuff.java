package Math;

import javax.swing.*;

public class MathStuff {

    public static void main(String[] args) {

        // Double variables can hold decimal values, both positive and negative.
        // They are useful for calculations that require precision, such as scientific computations.
        // In Java, double is a data type that can store larger floating-point numbers than float.
        double x = 3.14; // Setting a double to a decimal value
        double y = -10; // Setting a double to a negative value

        double z = Math.sqrt(x); // Calculating the square root of x using the Math.sqrt() method
        // The Math.sqrt() method returns the square root of a number.
        // The Math class provides methods for performing basic numeric operations such as exponentiation, logarithms,
        // square roots, and trigonometric functions.
        System.out.println(z); // Prints z (square root of x) to the console

        // Min, max
        // The Math class also provides methods like Math.min() and Math.max() to find the minimum or maximum of two numbers.
        // For example:
        double min = Math.min(x, y); // Finds the minimum of x and y
        double max = Math.max(x, y); // Finds the maximum of x and y
        System.out.println("Min: " + min); // Prints the minimum value to the console
        System.out.println("Max: " + max); // Prints the maximum value to the console

        // abs - returns the absolute value of a number
        // The absolute value of a number is its distance from zero on the number line, regardless of direction.
        // For example:
        double absoluteValue = Math.abs(y); // Gets the absolute value of y
        System.out.println("Absolute Value: " + absoluteValue); // Prints the absolute value of y to the console

        // round - rounds a number to the nearest integer
        // The round method rounds a floating-point number to the nearest integer.
        // If the fractional part is 0.5 or greater, it rounds up; otherwise, it rounds down.
        // This is useful when you want to convert a decimal number to an integer without losing too
        // For example:
        double roundedValue = Math.round(x); // Rounds x to the nearest integer
        System.out.println("Rounded Value: " + roundedValue); // Prints the rounded value of x to the console

        // ceil - rounds a number up to the nearest integer
        // The ceil method rounds a floating-point number up to the nearest integer.
        // This is useful when you want to ensure that you always round up, even if the fractional part is less than 0.5.
        // It is often used in scenarios where you need to ensure that a value is not less than a certain threshold
        // For example:
        double ceilingValue = Math.ceil(x); // Rounds x up to the nearest integer
        System.out.println("Ceiling Value: " + ceilingValue); // Prints the ceiling value of x to the console

        // floor - rounds a number down to the nearest integer
        // The floor method rounds a floating-point number down to the nearest integer.
        // This is useful when you want to ensure that you always round down, even if the fractional part is greater than 0.5.
        // For example:
        double floorValue = Math.floor(x); // Rounds x down to the nearest integer
        System.out.println("Floor Value: " + floorValue); // Prints the floor value of x to the console

        // Declaring 3 double variables. (Calculating the hypotenuse of a right triangle)
        // The hypotenuse is the longest side of a right triangle, opposite the right angle
        // It can be calculated using the Pythagorean theorem: c = sqrt(a^2 + b^2)
        // This is a common calculation in geometry and trigonometry.
        // The Pythagorean theorem states that in a right triangle, the square of the length of the hypotenuse
        // is equal to the sum of the squares of the lengths of the other two sides.
        double a; // Variable for side A
        double b; // Variable for side B
        double c; // Variable for the hypotenuse

        // Using JOptionPane to get user input for the sides of the triangle
        // JOptionPane is a class in Java that provides methods for creating dialog boxes.
        // It is commonly used for getting user input in a graphical user interface (GUI).
        // In this case, we are using it to get the lengths of sides A and B

        // Parse the input from the user to double values because the sides of a triangle can be decimal values.
        a = Double.parseDouble(JOptionPane.showInputDialog("Enter side A")); // Getting user input for value A
        b = Double.parseDouble(JOptionPane.showInputDialog("Enter side B")); // Getting user input for value B

        // Calculating the hypotenuse using the Pythagorean theorem by squaring the lengths of sides A and B,
        // adding them together, and then taking the square root of the result.
        // The Math.sqrt() method is used to calculate the square root.
        c = Math.sqrt((a*a) + (b*b)); // Performing math to find out the square root of the sum of the squares of A and B

        // Displaying the result using JOptionPane
        // JOptionPane.showMessageDialog() is used to display a message dialog box with the result
        // It takes two parameters: the parent component (null means no parent) and the message
        // no parent means the dialog will be centered on the screen because it has no parent component.
        // In this case, it shows the calculated hypotenuse to the user.
        JOptionPane.showMessageDialog(null, "The hypotenuse is " + c); // Using previous information to print the hypotenuse to the console


    }

}
