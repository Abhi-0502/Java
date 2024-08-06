package com.xworkz.bankapp;

import com.xworkz.bankapp.savings.SavingsAccount;

public class BankRunner {

    public static void main(String[] args){

        System.out.println("main started");

        SavingsAccount savingsAccount = new SavingsAccount();

        System.out.println(savingsAccount.getBalance());

        savingsAccount.deposit(1200);
        savingsAccount.deposit(200);


        System.out.println(savingsAccount.getBalance());

        savingsAccount.withdraw(200);

        System.out.println(savingsAccount.getBalance());
///another instance or memory

        SavingsAccount savingsAccount1 = new SavingsAccount();

        System.out.println("savingsAccount1    "+savingsAccount1.getBalance());
       /* SavingsAccount savingsAccount1 = new SavingsAccount();
        System.out.println(savingsAccount.getBalance());*/


        System.out.println("the closing account"+ savingsAccount.getBalance() );

        System.out.println("main ended");
    }
}
