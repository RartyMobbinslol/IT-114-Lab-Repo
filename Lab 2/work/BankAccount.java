public abstract class BankAccount 
{
    // DO NOT CHANGE ANY VARIABLE, METHOD, OR CLASS NAMES. THE AUTOGRADER DEPENDS ON THEM.
    private String accountHolder;
    private double balance;


    public BankAccount(String accountHolder, double initialDeposit) 
    {
        // TODO: Initialize the instance variables
        //acocountHolderfiled could be this.account holder
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
    }

    
    public void deposit(double amount) 
    {
        // TODO: Implement deposit logic
        // go thru past course notes!
        balance += amount;
        System.out.println("Updated Balance: " + balance);
    }

    /**
     * Abstract method: Child classes must implement this.
     */
    public abstract void withdraw(double amount);

   
    // --- GETTERS AND SETTERS ---
    
    public String getAccountHolder() 
    {
        // TODO: Return the account holder name
        return accountHolder; // Placeholder 
    }

    public double getBalance() 
    {
        // TODO: Return the current balance
        return balance; // Placeholder
    }

    protected void setBalance(double balance)
    {
        // TODO: Set the balance
        this.balance = balance;
    }
}