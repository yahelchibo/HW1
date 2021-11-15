package com.company;

public class PremiumAccount extends StandardAccount
{
    public PremiumAccount(int accountNumber, double creditLimit)
    {
        super(accountNumber, creditLimit);
    }

    @Override
    public double Withdraw(double amount)
    {
        Balance = Balance - amount;
        return amount;
    }
}
