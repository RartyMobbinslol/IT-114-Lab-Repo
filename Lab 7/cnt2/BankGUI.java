import javax.swing.*;
import java.awt.*;

public class BankGUI extends JFrame {

    private BankAccount account;
    private JLabel balanceLabel;
    private JTextField amountField;

    public BankGUI(BankAccount acc) {
        super("Bank Dashboard");
        this.account = acc;

        // setup main window size and exit rules
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(3, 1));
        setLocationRelativeTo(null);

        // top section for welcome text
        JPanel topPanel = new JPanel();
        JLabel welcomeLabel = new JLabel("Welcome, " + account.getAccountHolder() + "!");
        topPanel.add(welcomeLabel);

        // middle section for balance and text input
        JPanel midPanel = new JPanel();
        balanceLabel = new JLabel("Current Balance: $" + String.format("%.2f", account.getBalance()));
        amountField = new JTextField(10);
        midPanel.add(balanceLabel);
        midPanel.add(new JLabel("Amount: $"));
        midPanel.add(amountField);

        // bottom section for all the buttons
        JPanel bottomPanel = new JPanel();
        JButton btnDeposit = new JButton("Deposit");
        JButton btnWithdraw = new JButton("Withdraw");
        JButton btnExit = new JButton("Exit");

        // deposit button click event
        btnDeposit.addActionListener(e -> {
            try {
                double amt = Double.parseDouble(amountField.getText());
                String msg = account.deposit(amt);
                updateBalance();
                JOptionPane.showMessageDialog(this, msg);
            } catch (Exception ex) {
                // catches text instead of numbers
                JOptionPane.showMessageDialog(this, "Error: Please enter a valid number");
            }
            amountField.setText("");
        });

        // withdraw button click event
        btnWithdraw.addActionListener(e -> {
            try {
                double amt = Double.parseDouble(amountField.getText());
                String msg = account.withdraw(amt);
                updateBalance();
                JOptionPane.showMessageDialog(this, msg);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: Please enter a valid number");
            }
            amountField.setText("");
        });

        // exit button
        btnExit.addActionListener(e -> {
            System.exit(0);
        });

        // add everything to the screen
        bottomPanel.add(btnDeposit);
        bottomPanel.add(btnWithdraw);
        bottomPanel.add(btnExit);

        add(topPanel);
        add(midPanel);
        add(bottomPanel);

        setVisible(true);
    }

    // quick helper to refresh the label text
    private void updateBalance() {
        balanceLabel.setText("Current Balance: $" + String.format("%.2f", account.getBalance()));
    }
}