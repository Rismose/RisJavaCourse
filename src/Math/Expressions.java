// Expressions.java
// Demonstrates basic math operators in Java: +, -, *, /, %, ++, --
// Try it yourself: Change the numbers, use other operators, and see what happens!

package Math;

public class Expressions {

    public static void main(String[] args) {
        // Math expressions use operands (values) and operators (+, -, *, /, %, ++, --)

        // --- ADDITION ---
        int friends = 10; // Initial number of friends
        friends++; // Adds 1 (now 11)
        System.out.println(friends); // Prints 11

        // --- SUBTRACTION ---
        int enemies = 10; // Initial number of enemies
        enemies--; // Subtracts 1 (now 9)
        System.out.println(enemies); // Prints 9

        // --- DIVISION ---
        int classmates = 25; // Total number of classmates
        int groups = classmates / 5; // Divide classmates into groups of 5 (result: 5)
        // This means 25 classmates can be divided into 5 groups of 5
        // Each group will have 5 classmates
        System.out.println(groups); // Prints 5

        // --- MULTIPLICATION ---
        int total = 100; // Total number of items
        int group = total / 5; // Divides 100 by 5 (result: 20)
        System.out.println(group); // Prints 20

        // --- MODULUS (remainder) ---
        int remainder = classmates % 4; // Divides 25 by 4 and gets the remainder
        // This means when 25 classmates are divided into groups of 4,
        // there will be 1 classmate left over
        // The modulus operator (%) gives the remainder of a division
        System.out.println(remainder); // Prints 1

        // Try it yourself:
        // - Change the numbers and see what prints!
        // - Try using other operators like +=, -=, *=, /=
        // - What happens if you divide by zero?
    }
}
