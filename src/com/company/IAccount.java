package com.company;

public interface IAccount
{
    void Deposit(double amount);//הוספת סכום לסכום הקיים
    double Withdraw(double amount); //// משיכת הסכום המבוקש לפי מגבלת החשבון
    double GetCurrentBalance();// מחזירה את יתרת השוטף הכפולה
    int GetAccountNumber();// מחזירה מספר חשבון כמספר שלם

}
