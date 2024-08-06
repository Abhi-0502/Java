package com.xworkz.bankapp.savings;

import com.xworkz.bankapp.bankaccount.BankAccount;

public class SavingsAccount extends BankAccount {
    //code reusability

    double interest = 0.7;

    public SavingsAccount(){

    }

//   public SavingsAccount(double minbalance) {
//        setBalance(minbalance);

//    }

public void  rateOfInterest(){
        double interestAmount = getBalance()*interest/100;
deposit(interestAmount);
    }
}
