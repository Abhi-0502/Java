package com.xworkz.bankapp;

import com.xworkz.bankapp.current.CurrentAccount;
import com.xworkz.bankapp.savings.SavingsAccount;

public class BankRunner {

    public static void main(String[] args){

        System.out.println("main started");

       /* SavingsAccount savingsAccount = new SavingsAccount();

        System.out.println(savingsAccount.getBalance());

        savingsAccount.deposit(1200);
        savingsAccount.deposit(200);


        System.out.println(savingsAccount.getBalance());

        savingsAccount.withdraw(200);

        System.out.println(savingsAccount.getBalance());
///another instance or memory

        SavingsAccount savingsAccount1 = new SavingsAccount(10);

        System.out.println("savingsAccount1    "+savingsAccount1.getBalance());

     System.out.println("----------------------------------+");
       SavingsAccount savingsAccount2 = new SavingsAccount();
       savingsAccount.deposit(1300);

        System.out.println(savingsAccount2.getBalance());
        savingsAccount.withdraw(500);
     System.out.println("-----------------------------------+");


        SavingsAccount savingsAccount3 = new SavingsAccount();
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(2000);

        System.out.println(savingsAccount3.getBalance());
        savingsAccount.withdraw(2000);
        System.out.println(savingsAccount3.getBalance());

        SavingsAccount savingsAccount4 = new SavingsAccount();
        System.out.println(savingsAccount.getBalance());
        savingsAccount.deposit(5000);

        System.out.println(savingsAccount4.getBalance());
        savingsAccount.withdraw(3000);
        System.out.println(savingsAccount4.getBalance());

        SavingsAccount savingsAccount5 = new SavingsAccount();
        System.out.println(savingsAccount5.getBalance());
        savingsAccount.deposit(6000);

        System.out.println(savingsAccount5.getBalance());
        savingsAccount.withdraw(1000);
        System.out.println(savingsAccount5.getBalance());


        SavingsAccount savingsAccount6 = new SavingsAccount();
        System.out.println(savingsAccount6.getBalance());
        savingsAccount.deposit(7000);

        System.out.println(savingsAccount6.getBalance());
        savingsAccount.withdraw(2000);
        System.out.println(savingsAccount6.getBalance());

        SavingsAccount savingsAccount7 = new SavingsAccount();
        System.out.println(savingsAccount7.getBalance());
        savingsAccount.deposit(8000);

        System.out.println(savingsAccount7.getBalance());
        savingsAccount.withdraw(200);
        System.out.println(savingsAccount7.getBalance());


        SavingsAccount savingsAccount8 = new SavingsAccount();
        System.out.println(savingsAccount8.getBalance());
        savingsAccount.deposit(6000);

        System.out.println(savingsAccount8.getBalance());
        savingsAccount.withdraw(4000);
        System.out.println(savingsAccount6.getBalance());

        SavingsAccount savingsAccount9 = new SavingsAccount();
        System.out.println(savingsAccount9.getBalance());
        savingsAccount.deposit(9000);

        System.out.println(savingsAccount9.getBalance());
        savingsAccount.withdraw(500);
        System.out.println(savingsAccount9.getBalance());

        SavingsAccount savingsAccount10 = new SavingsAccount();
        System.out.println(savingsAccount10.getBalance());
        savingsAccount.deposit(6000);

        System.out.println(savingsAccount10.getBalance());
        savingsAccount.withdraw(4000);
        System.out.println(savingsAccount10.getBalance());

        SavingsAccount savingsAccount11 = new SavingsAccount();
        System.out.println(savingsAccount11.getBalance());
        savingsAccount.deposit(9000);

        System.out.println(savingsAccount11.getBalance());
        savingsAccount.withdraw(500);
        System.out.println(savingsAccount11.getBalance());

        SavingsAccount savingsAccount12 = new SavingsAccount();
        System.out.println(savingsAccount12.getBalance());
        savingsAccount.deposit(6000);

        System.out.println(savingsAccount12.getBalance());
        savingsAccount.withdraw(400);
        System.out.println(savingsAccount12.getBalance());

        SavingsAccount savingsAccount13 = new SavingsAccount();
        System.out.println(savingsAccount13.getBalance());
        savingsAccount.deposit(12000);

        System.out.println(savingsAccount13.getBalance());
        savingsAccount.withdraw(200);
        System.out.println(savingsAccount13.getBalance());

        SavingsAccount savingsAccount14 = new SavingsAccount();
        System.out.println(savingsAccount14.getBalance());
        savingsAccount.deposit(9000);

        System.out.println(savingsAccount14.getBalance());
        savingsAccount.withdraw(400);
        System.out.println(savingsAccount14.getBalance());

        SavingsAccount savingsAccount15 = new SavingsAccount();
        System.out.println(savingsAccount15.getBalance());
        savingsAccount.deposit(19000);

        System.out.println(savingsAccount15.getBalance());
        savingsAccount.withdraw(5000);
        System.out.println(savingsAccount15.getBalance());
        System.out.println("the closing account"+ savingsAccount.getBalance() );*/


       SavingsAccount abhisaccount = new SavingsAccount();
       abhisaccount.deposit(12000);
       abhisaccount.deposit(200);
       System.out.println("the closing account"+ abhisaccount.getBalance() );


       SavingsAccount papasaccount = new SavingsAccount(2000);
       abhisaccount.transfer(papasaccount , 900);

       System.out.println("the closing account"+ abhisaccount.getBalance() );
       System.out.println("the closing balance of papas account"+ papasaccount.getBalance());

       SavingsAccount myBrotherAccount = new SavingsAccount();
       abhisaccount.transfer(myBrotherAccount,500);
       System.out.println("the closing balance is "+ abhisaccount.getBalance());
       System.out.println("the closing balance of myBrother account is "+ myBrotherAccount.getBalance());

        System.out.println("main ended");
    }
}
