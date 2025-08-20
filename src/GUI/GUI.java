// GUI.java
// Demonstrates a simple graphical user interface (GUI) in Java using Swing
// Try it yourself: Change the questions, add more dialogs, or use other GUI components!

package GUI;

import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        // --- BASIC GUI EXAMPLE ---
        // Ask for the user's name using a dialog box
        String name = JOptionPane.showInputDialog("What is your name?"); // Show a dialog to get user input

        // Reply with a greeting
        JOptionPane.showMessageDialog(null, "Hello " + name); // Show a message dialog with the user's name

        // Ask for the user's age
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?")); // Show a dialog to get the user's age and convert it to an integer

        // Show a message based on age
        if (age >= 18) { // Check if the user is 18 or older
            // If the user is old enough to vote
            JOptionPane.showMessageDialog(null, "You are old enough to vote"); // Show a message dialog indicating the user can vote
        } else { // If the user is younger than 18
            // If the user is not old enough to vote
            JOptionPane.showMessageDialog(null, "You are not old enough to vote"); // Show a message dialog indicating the user cannot vote
        }

        // Try it yourself:
        // - Change the questions or add more dialogs.
        // - Use other Swing components (e.g., JFrame, JButton).
        // - Add input validation for age.
    }
}
