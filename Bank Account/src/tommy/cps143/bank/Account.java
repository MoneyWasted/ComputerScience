package tommy.cps143.bank;

public class Account {
	private int accountNumber;
	private int accountPIN;
    private double accountBalance;
    private String customerName;
    
    public String toString()
    {
    	return String.format("Number: %s\nPIN: %d\nBalance: $%.2f\nName: %s\n", accountNumber, accountPIN, accountBalance, customerName);
    }

    public void deposit(double depositAmount)
    {
        this.accountBalance += depositAmount;
        System.out.printf("Deposit of $%.2f made. New balance is $%.2f\n", depositAmount, this.accountBalance);
    }

    public void withdrawal(double withdrawalAmount)
    {
        if (this.accountBalance - withdrawalAmount <= 0)
        {
            System.out.printf("Only $%.2f available. Withdrawal not processed!\n", this.accountBalance);
        }
        else
        {
            this.accountBalance -= withdrawalAmount;
            System.out.printf("Withdrawal of $%.2f processed. Remaining balance is $%.2f\n", withdrawalAmount, this.accountBalance);
        }
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }
    
    public int getAccountPIN()
    {
    	return accountPIN;
    }
    
    public void setAccountPIN(int accountPIN)
    {
    	this.accountPIN = accountPIN;
    }

    public double getAccountBalance()
    {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance)
    {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
}
