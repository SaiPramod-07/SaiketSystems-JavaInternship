package SaiKetSystems_Internship.BasicBankingSystem;
import java.util.InputMismatchException;
import java.util.Scanner;
public class BankingSystem {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("----Welcome to Banking System----");
        System.out.print("Enter name:");
        String name=input.nextLine();
        BankAccount account=new BankAccount(name);
        System.out.println("Bank Account created successfully!");
        System.out.println("Account Number is:"+account.accountNumber);
        while (true)
        {

            System.out.println("\n===MENU===");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Display Balance");
            System.out.println("4.Transaction History");
            System.out.println("5.Exit");
            System.out.print("Enter choice (1-5):");
            int choice;
            try
            {
                choice=input.nextInt();
                input.nextLine();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Invalid input Please enter Number");
                input.nextLine();
                continue;
            }
            switch (choice)
            {
                case 1:
                {
                    System.out.print("Enter amount to deposit ₹:");
                    double amount=input.nextDouble();
                    account.deposit(amount);
                    break;
                }
                case 2:
                {
                    System.out.print("Enter amount to withdraw ₹:");
                    double amount=input.nextDouble();
                    try
                    {
                        account.withdraw(amount);
                    }
                    catch (InsufficientFunds e)
                    {
                        System.out.println("Error:"+e.getMessage());
                    }
                    break;
                }
                case 3:
                {
                    account.displayBalance();
                    break;
                }
                case 4:
                {
                    account.showTransactionHistory();
                    break;
                }
                case 5:
                {
                    System.out.println("Exiting.....ThankYou!");
                    return;
                }
                default:
                {
                    System.out.println("Invalid choice! please try again....");
                }
            }
        }
    }
}
