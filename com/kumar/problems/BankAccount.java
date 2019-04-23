package com.kumar.problems;

public class BankAccount {
    private String acctID;
    private double balance;
    //private  double amount;


    public BankAccount(String acctID, double balance) {
        this.acctID = acctID;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

    public String getAcctID(){
        return acctID;
    }

    public double getBalance() {
        return balance;
    }
}
