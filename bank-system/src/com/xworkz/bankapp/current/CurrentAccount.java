package com.xworkz.bankapp.current;

import com.xworkz.bankapp.bankaccount.BankAccount;

public class CurrentAccount {

    public  CurrentAccount(double minbalance){
        BankAccount bankAccount=new BankAccount();
        bankAccount.setBalance(minbalance);
        bankAccount.getBalance();
    }







}
