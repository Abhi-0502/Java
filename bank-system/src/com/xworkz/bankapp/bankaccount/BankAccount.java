package com.xworkz.bankapp.bankaccount;

public class BankAccount {

    private double balance;

    public void setBalance(double balance){

        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        System.out.println("deposit started");
        if(amount > 0) {

            balance = balance + amount;
            System.out.println("Deposite is Successfully");
        }
        else System.out.println("Amount cannot be zero");
        System.out.println("deposit ended");
    }

    public void withdraw(double amount){
        System.out.println("withdraw started");
        if(amount <= balance)
            balance = balance - amount;
        else System.out.println("Insufficient Funds");
        System.out.println("withdraw ended");
    }
}
