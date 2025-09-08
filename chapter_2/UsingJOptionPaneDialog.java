import javax.swing.*;

public class UsingJOptionPaneDialog {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name: ");
        
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "You chose No. Program will exit.");
            System.exit(0);
        } 
        String output = "Hi! " + name;
        JOptionPane.showMessageDialog(null, output);
    }
}
