package com.company;

public class BasicAccount extends StandardAccount

{
    protected double WithdrawaLimit;

    public BasicAccount(int accountNumber, double creditLimit ,  double withdrawaLimit)
    {
        super(accountNumber, creditLimit);
        this.WithdrawaLimit = withdrawaLimit;
    }


    @Override
    public double Withdraw(double amount) {
        if (WithdrawaLimit<amount)
        {
            Balance = Balance - WithdrawaLimit;
            return Balance;
        }
        else
        {
            Balance = Balance - amount;
            return WithdrawaLimit;
        }
    }
}
