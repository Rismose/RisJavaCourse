import javax.swing.*;

public class GUI {

    public static void main() {

        String name = JOptionPane.showInputDialog("What is your name?");

        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));


        if (age >= 18) {
            JOptionPane.showMessageDialog(null, "You are old enough to vote");
        } else {
            JOptionPane.showMessageDialog(null, "You are not old enough to vote");
        }

        // System.out.println(name);

    }

}
