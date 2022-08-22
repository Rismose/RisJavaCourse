import javax.swing.*;

public class GUI {

    public static void main() {

        // Create a new JFrame container. Asking for your name and storing it in a string
        String name = JOptionPane.showInputDialog("What is your name?");

        // Creating another JFrame container and replying with your name.
        JOptionPane.showMessageDialog(null, "Hello " + name);

        // Creating another JFrame container and asking for your age. Then storing it in an integer.
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));

        // Simple if statement with another JFrame container. Using your age to reply with a message on weather you are old enough to vote.
        if (age >= 18) {
            JOptionPane.showMessageDialog(null, "You are old enough to vote");
        } else {
            JOptionPane.showMessageDialog(null, "You are not old enough to vote");
        }
    }

}
