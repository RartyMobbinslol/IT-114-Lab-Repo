public class SavingsAccount extends BankAccount 
{
    // DO NOT CHANGE ANY VARIABLE, METHOD, OR CLASS NAMES. THE AUTOGRADER DEPENDS ON THEM.
    public SavingsAccount(String accountHolder, double initialDeposit) 
    {
        // TODO: Call the parent constructor using 'super'
        super(accountHolder, initialDeposit);
    }

    @Override
    public void withdraw(double amount) 
    {
        // TODO: Implement Savings withdrawal logic
         if (amount > getBalance()) 
         {
            System.out.println("Transaction Denied: Insufficient funds");
         } 
       
        else 
        {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful.");
        }

        System.out.println("Remaining Balance: " + getBalance());
    }
}