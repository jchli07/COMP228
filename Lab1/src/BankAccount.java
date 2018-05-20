public class BankAccount {

    int accountNumber;
    private String name;
    private double balance;

    public BankAccount(int accountNumber, String name, double balance)
    {
        this.accountNumber = accountNumber;
        this.name = name;
        if(balance > 0.0)
        {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmt)
    {
        if (depositAmt > 0.0)
        {
            balance += depositAmt;
        }
    }
//not used
    public String getName()
    {
        return name;
    }
//not used
    public void setName(String name)
    {
        this.name = name;
    }

    public double getBalance()
    {
        return balance;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }
}
