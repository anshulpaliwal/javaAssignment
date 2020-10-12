package com.company;

public class PaymentGateway {
    public static void transfer(SavingsAccount sender, SavingsAccount receiver, double amount) {
        if (amount< sender.getBalance()) {
            try {
                sender.withdraw(amount);
                receiver.deposit(amount);
                System.out.println("Transaction is succeed");
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
        else {
            System.out.println("Transaction failed due to insufficient balance.");
        }
    }
}
