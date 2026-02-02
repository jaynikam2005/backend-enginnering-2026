public class BankAccount 
{

    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber,double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    void deposit(double amount)
    {
        balance+=amount;
        System.out.println("Deposited: "+amount);
    }

    void withdraw(double amount)
    {
        if(amount>balance)
        {
            
            System.out.println("Insufficient balance");
        }
        else
        {
            balance-=amount;
            System.out.println("You Withdrew from your balance the remaining balance is : "+balance);

        }
    }

    double displayBalance()
    {       
        return balance;
    }
}
