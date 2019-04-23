package com.kumar.problems;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount one = new BankAccount("12345",10000);
        BankAccount two = new BankAccount("123457",20000);

        String acctNum = one.getAcctID();
        double balance = one.getBalance();
        System.out.println("Account "+ acctNum + " has an initial balance of " + balance);

        acctNum = two.getAcctID();
        balance = two.getBalance();
        System.out.println("Account "+ acctNum + " has an initial balance of " + balance);

        one.deposit(500);
        two.withdraw(400);

        System.out.println("Account "+ one.getAcctID() + " has an new updated balance of " + one.getBalance());

        System.out.println("Account "+ two.getAcctID() + " has an new updated balance of " + two.getBalance());

        double total_balance = one.getBalance() + two.getBalance();

        System.out.println("Total Balance of both Accounts are "+ total_balance);
    }
}
