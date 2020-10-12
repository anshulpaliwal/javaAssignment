package com.company;

public class Main {

    public static void main(String[] args) {
        SavingsAccount account1= new SavingsAccount("Zayn",1000);
        SavingsAccount account2= new SavingsAccount("Malik");
        account1.display();
        account2.display();
        account1.deposit(2000);
        account2.deposit(2000);
        try {
            account1.withdraw(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            account2.withdraw(600);
        } catch (Exception e) {
            e.printStackTrace();
        }
        SavingsAccount.getNextAccountNumber();
        PaymentGateway.transfer(account1, account2, 100);
    }
}
