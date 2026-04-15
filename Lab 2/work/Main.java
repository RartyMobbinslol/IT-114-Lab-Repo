import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        
        // TODO: Create a Scanner to read input
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Ask for User Name and Initial Deposit
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Initial Deposit: ");
        double deposit = scanner.nextDouble();
        
        // TODO: Ask user to select Checking or Savings
        System.out.println("Choose Account Type:");
        System.out.println("1. Checking");
        System.out.println("2. Savings");
        int type = scanner.nextInt();
        
        // TODO: Instantiate the correct account type based on input
        BankAccount account;
        
        if (type==1)
        {
            account = new CheckingAccount(name, deposit);
        }
        else
        {
            account = new SavingsAccount(name, deposit);
        }
        
        // TODO: Create a loop (while) that displays a menu:
        boolean running = true;
        
        while (running)
        {
            System.out.println("\n--- MENU ---");
            
        // 1. Deposit
            System.out.println("1. Deposit");
        // 2. Withdraw
            System.out.println("2. Withdraw");
        // 3. Check Balance
            System.out.println("3. View Balance");
        // 4. Exit
            System.out.println("4. Exit");
            
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            
            if (choice == 1)
            {
                System.out.print("Amount to desposit: ");
                account.deposit(scanner.nextDouble());
            }
            else if (choice == 2)
            {
                System.out.print("amount to withdraw: ");
                account.withdraw(scanner.nextDouble());
            }
            else if (choice == 3)
            {
                System.out.println("Current Balance: " + account.getBalance());

            } 
            else if (choice == 4) 
            {
                System.out.println("Goodbye.");
                running = false;
            }
            else 
            {
                System.out.println("Invalid Option.");
            }
    

        }

    }
}