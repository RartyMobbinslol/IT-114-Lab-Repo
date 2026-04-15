public abstract class BankAccount {
    private String accountHolder;
    private double balance;

    // set up the initial account
    public BankAccount(String accountHolder, double initialDeposit) {
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
    }

    // handles putting money in
    public String deposit(double amount) {
        if (amount <= 0) {
            return "Please enter a valid number";
        }
        balance = balance + amount;
        return String.format("Deposited $%.2f. New Balance: $%.2f", amount, balance);
    }

    // force subclasses to make their own withdraw rules
    public abstract String withdraw(double amount);

    // getters and setters below
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}