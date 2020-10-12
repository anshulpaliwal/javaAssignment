package com.company;

public class SavingsAccount {
    private String name;
    private double balance=0;
    private int accountNumber;
    private static int expectedAccNo = 1;
    {
        this.accountNumber = expectedAccNo++;
    }
    public SavingsAccount(String name, double balance) {
        this.name=name;
        this.balance=balance;
    }
    public SavingsAccount(String name) {
        super();
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public void withdraw(double amount) throws Exception {
        if (balance <= 0) {
            throw new Exception("Enough balance is not available in your account.");
        } else {
            balance -= amount;
        }
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void display() {
        System.out.println("Account No: " + getAccountNumber());
        System.out.println("Name: " + getName());
        System.out.println("Balance: " + getBalance());
    }
    public static void getNextAccountNumber() {
        System.out.println("Next account number will be " + SavingsAccount.expectedAccNo);
    }
}
