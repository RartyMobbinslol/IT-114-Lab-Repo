public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolder, double initialDeposit) {
        super(accountHolder, initialDeposit);
    }

    @Override
    public String withdraw(double amount) {
        if (amount <= 0) {
            return "Please enter a valid number";
        }

        double currentBal = getBalance();

        // stop the transaction if they dont have enough money
        if (amount > currentBal) {
            return String.format("Transaction Denied: Insufficient funds. Balance remains: $%.2f", currentBal);
        } else {
            setBalance(currentBal - amount);
            return String.format("Withdrew $%.2f. New Balance: $%.2f", amount, getBalance());
        }
    }
}