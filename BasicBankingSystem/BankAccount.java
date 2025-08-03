package SaiKetSystems_Internship.BasicBankingSystem;

import java.util.ArrayList;
class InsufficientFunds extends Exception
{
    public InsufficientFunds(String message)
    {
        super(message);
    }
}
public class BankAccount {
    protected String accountHolderName;
    protected String accountNumber;
    protected double balance;
    protected ArrayList<String> transactionHistory;
    protected static int nextAccountNumber=1000;
    protected BankAccount(String accountHolderName)
    {
        this.accountHolderName=accountHolderName;
        this.balance=0.0;
        this.accountNumber=getAccountNumber();
        this.transactionHistory=new ArrayList<>();
    }
    public String getAccountNumber()
    {
        return "ACC"+(++nextAccountNumber);
    }
    public void deposit(double amount)
    {
        if(amount<=0)
        {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance+=amount;
        transactionHistory.add("Deposited Rupees ₹"+amount);
        System.out.println("Deposited ₹"+ amount+" successfully!");
    }
    public void withdraw(double amount) throws InsufficientFunds
    {
        if(amount>balance)
        {
            throw new InsufficientFunds("Insufficient funds!");
        }
        balance-=amount;
        transactionHistory.add("Withdrawn ₹"+amount);
        System.out.println("Withdrawn ₹"+amount+" successfully!");
    }
    public void displayBalance()
    {
        System.out.println("Balance:"+balance);
    }
    public void showTransactionHistory()
    {
        for(int i=0;i<transactionHistory.size();i++)
        {
            System.out.println(transactionHistory.get(i));
        }
    }
}
