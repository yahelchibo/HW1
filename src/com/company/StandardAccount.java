package com.company;

public class StandardAccount implements IAccount
{
    protected int AccountNumber;
    protected double CreditLimit;
    protected double Balance;


    public StandardAccount(int accountNumber, double creditLimit)
    {
        this.AccountNumber = accountNumber;
        this.CreditLimit = creditLimit;
        this.Balance = 0;

    }


    @Override
    public void Deposit(double amount)
    {
        Balance = Balance + amount;

    }

    @Override
    public double Withdraw(double amount)
    {
        {
            if ((Balance-amount<Balance) && (Balance != CreditLimit ))
            {
                double yahel = Balance +(-CreditLimit);
                return yahel;
            }
            else if (Balance == CreditLimit)
            {
                return 0;
            }
            else
            {
                Balance -= amount;
                return Balance;
            }
        }


    }

    @Override
    public double GetCurrentBalance()
    {
        return Balance;
    }

    @Override
    public int GetAccountNumber()
    {
        return AccountNumber;
    }
}
