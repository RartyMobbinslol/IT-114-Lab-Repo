public class CheckingAccount extends BankAccount {

    // constant fee for checking
    private double overdraftFee = 35.00;

    public CheckingAccount(String accountHolder, double initialDeposit) {
        super(accountHolder, initialDeposit);
    }

    @Override
    public String withdraw(double amount) {
        // check for bad input first
        if (amount <= 0) {
            return "Please enter a valid number";
        }

        double currentBal = getBalance(); 

        // charge the fee if they take out too much
        if (amount > currentBal) {
            setBalance(currentBal - amount - overdraftFee);
            return String.format("Overdraft! $%.2f fee applied. New Balance: $%.2f", overdraftFee, getBalance());
        } else {
            // normal withdrawal
            setBalance(currentBal - amount);
            return String.format("Withdrew $%.2f. New Balance: $%.2f", amount, getBalance());
        }
    }
}