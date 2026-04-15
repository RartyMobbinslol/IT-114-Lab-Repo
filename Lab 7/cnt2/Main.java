import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        
        // step 1 get user name
        String name = JOptionPane.showInputDialog("Please enter your name:");
        if (name == null || name.trim().isEmpty()) {
            System.exit(0);
        }

        // step 2 get deposit amount
        double initialDeposit = 0;
        while (true) {
            String depStr = JOptionPane.showInputDialog("Enter initial deposit amount:");
            if (depStr == null) {
                System.exit(0);
            }
            try {
                initialDeposit = Double.parseDouble(depStr);
                if (initialDeposit < 0) {
                    JOptionPane.showMessageDialog(null, "Error: Please enter a valid number");
                } else {
                    break; // broke out of loop successfully
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Please enter a valid number");
            }
        }

        // step 3 pick which account they want
        String[] options = {"Checking", "Savings"};
        int choice = JOptionPane.showOptionDialog(null, "Checking or Savings?", "Account Type",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (choice == -1) {
            System.exit(0);
        }

        // create the right object based on choice
        BankAccount account;
        if (choice == 0) {
            account = new CheckingAccount(name.trim(), initialDeposit);
        } else {
            account = new SavingsAccount(name.trim(), initialDeposit);
        }

        // launch the actual dashboard
        BankAccount finalAcct = account;
        SwingUtilities.invokeLater(() -> {
            new BankGUI(finalAcct);
        });
    }
}