package com.xworkz.passportapp;

public class PassportIdNotFound extends RuntimeException{

    public PassportIdNotFound(String errorMessage){
        System.out.println(errorMessage);
    }
}
