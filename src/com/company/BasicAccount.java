package com.company;

public class BasicAccount extends StandardAccount

{
    protected double WithdrawaLimit;

    public BasicAccount(int accountNumber ,  double withdrawaLimit)
    {
        super(accountNumber, 0);
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
