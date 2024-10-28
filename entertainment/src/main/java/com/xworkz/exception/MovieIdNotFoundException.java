package com.xworkz;

public class MovieIdNotFoundException extends RuntimeException{

    public MovieIdNotFoundException(String errorMessage){
        System.out.println(errorMessage);
    }
}
